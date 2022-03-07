package binary.wz.spring.beans.factory.annotation;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.PropertyValues;
import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.beans.factory.BeanFactoryAware;
import binary.wz.spring.beans.factory.ConfigurableListableBeanFactory;
import binary.wz.spring.beans.factory.config.InstantiationAwareBeanPostProcessor;
import binary.wz.spring.util.ClassUtils;
import cn.hutool.core.bean.BeanUtil;

import java.lang.reflect.Field;

/**
 * @author binarywz
 * @date 2022/3/7 23:08
 * @description:
 */
public class AutowiredAnnotationBeanPostProcessor implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private ConfigurableListableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ConfigurableListableBeanFactory) beanFactory;
    }

    /**
     * 处理有 @Value、@Autowired 注解的属性，进行属性信息的提取和设置
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        // 1. 处理注解 @Value
        Class<?> clazz = bean.getClass();
        /**
         * 在 AbstractAutowireCapableBeanFactory 类中使用的是 CglibSubclassingInstantiationStrategy 进行类的创建.
         * 需要判断是否为 CGlib 创建对象，否则无法获取类的正确信息.
         */
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;

        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            Value valueAnnotation = field.getAnnotation(Value.class);
            if (null != valueAnnotation) {
                String value = valueAnnotation.value();
                value = beanFactory.resolveEmbeddedValue(value);
                BeanUtil.setFieldValue(bean, field.getName(), value);
            }
        }

        // 2. 处理注解 @Autowired
        for (Field field : declaredFields) {
            Autowired autowiredAnnotation = field.getAnnotation(Autowired.class);
            if (null != autowiredAnnotation) {
                Class<?> fieldType = field.getType();
                String dependentBeanName = null;
                Object dependentBean = null;
                Qualifier qualifierAnnotation = field.getAnnotation(Qualifier.class);
                if (null != qualifierAnnotation) {
                    dependentBeanName = qualifierAnnotation.value();
                    dependentBean = beanFactory.getBean(dependentBeanName, fieldType);
                } else {
                    dependentBean = beanFactory.getBean(fieldType);
                }
                BeanUtil.setFieldValue(bean, field.getName(), dependentBean);
            }
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }
}
