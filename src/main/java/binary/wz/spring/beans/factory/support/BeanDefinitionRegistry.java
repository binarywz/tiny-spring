package binary.wz.spring.beans.factory.support;

import binary.wz.spring.beans.factory.config.BeanDefinition;

/**
 * @author binarywz
 * @date 2022/2/15 23:55
 * @description:
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
