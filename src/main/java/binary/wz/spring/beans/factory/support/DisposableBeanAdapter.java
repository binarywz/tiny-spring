package binary.wz.spring.beans.factory.support;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.DisposableBean;
import binary.wz.spring.beans.factory.config.BeanDefinition;
import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Method;

/**
 * @author binarywz
 * @date 2022/2/26 14:20
 * @description: 销毁方法有两种甚至多种，目前有实现接口DisposableBean、配置信息destroy-method两种方式。
 * 
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }
    
    @Override
    public void destroy() throws Exception {
        // 1.实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2.xml/注解配置 destroy-method (判断是为了避免二次执行销毁)
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
