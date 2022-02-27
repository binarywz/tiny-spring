package binary.wz.spring.beans.factory;

/**
 * @author binarywz
 * @date 2022/2/27 21:32
 * @description: FactoryBean是一个工厂Bean，可以生成某一个类型Bean实例，
 * 它最大的一个作用是: 可以让我们自定义Bean的创建过程
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 */
public interface FactoryBean<T> {

    /**
     * 获取对象
     * @return
     * @throws Exception
     */
    T getObject() throws Exception;

    /**
     * 获取对象类型
     * @return
     */
    Class<?> getObjectType();

    /**
     * 判断对象是否为单例
     * @return
     */
    boolean isSingleton();

}
