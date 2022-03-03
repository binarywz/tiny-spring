package binary.wz.spring.aop.framework;

import binary.wz.spring.aop.AdvisedSupport;

/**
 * @author binarywz
 * @date 2022/3/3 23:27
 * @description: 代理工厂，解决关于JDK和Cglib两种代理的选择问题，根据不同的创建需求进行控制
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }

}
