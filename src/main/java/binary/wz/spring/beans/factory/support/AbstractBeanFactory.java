package binary.wz.spring.beans.factory.support;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.beans.factory.config.BeanDefinition;

/**
 * @author binarywz
 * @date 2022/2/15 23:46
 * @description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
