package binary.wz.spring.beans.factory;

/**
 * @author binarywz
 * @date 2022/2/26 22:23
 * @description: 实现此接口，即能感知（获取）到所属的ClassLoader
 * Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}
