package binary.wz.spring.beans.factory.config;

import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.beans.factory.HierarchicalBeanFactory;

/**
 * @author binarywz
 * @date 2022/2/19 23:37
 * @description: Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link BeanFactory} interface.
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
