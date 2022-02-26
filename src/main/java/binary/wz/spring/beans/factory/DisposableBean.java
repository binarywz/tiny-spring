package binary.wz.spring.beans.factory;

/**
 * @author binarywz
 * @date 2022/2/25 23:57
 * @description: Interface to be implemented by beans that want to release resources
 * on destruction. A BeanFactory is supposed to invoke the destroy
 * method if it disposes a cached singleton. An application context
 * is supposed to dispose all of its singletons on close.
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
