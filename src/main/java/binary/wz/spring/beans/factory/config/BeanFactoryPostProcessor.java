package binary.wz.spring.beans.factory.config;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author binarywz
 * @date 2022/2/22 23:27
 * @description: 允许自定义修改BeanDefinition属性信息
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
