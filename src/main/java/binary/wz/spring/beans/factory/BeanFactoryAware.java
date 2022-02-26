package binary.wz.spring.beans.factory;

import binary.wz.spring.beans.BeansException;

/**
 * @author binarywz
 * @date 2022/2/26 22:22
 * @description: 实现此接口，即能感知（获取）到所属的BeanFactory
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
