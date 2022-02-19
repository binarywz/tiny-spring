package binary.wz.spring.beans.factory;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.config.AutowireCapableBeanFactory;
import binary.wz.spring.beans.factory.config.BeanDefinition;
import binary.wz.spring.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author binarywz
 * @date 2022/2/19 23:40
 * @description: Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
