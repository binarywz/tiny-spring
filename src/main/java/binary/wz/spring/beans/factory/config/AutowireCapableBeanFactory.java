package binary.wz.spring.beans.factory.config;

import binary.wz.spring.beans.factory.BeanFactory;

/**
 * @author binarywz
 * @date 2022/2/19 23:36
 * @description: Extension of the {@link BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
