package binary.wz.spring.aop.framework;

/**
 * @author binarywz
 * @date 2022/3/1 23:33
 * @description: AOP代理的抽象
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects. Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 */
public interface AopProxy {

    Object getProxy();

}
