package binary.wz.spring.beans.aop;

import binary.wz.spring.aop.AdvisedSupport;
import binary.wz.spring.aop.MethodMatcher;
import binary.wz.spring.aop.TargetSource;
import binary.wz.spring.aop.aspectj.AspectJExpressionPointcut;
import binary.wz.spring.aop.framework.Cglib2AopProxy;
import binary.wz.spring.aop.framework.JdkDynamicAopProxy;
import binary.wz.spring.aop.framework.ReflectiveMethodInvocation;
import binary.wz.spring.beans.aop.interceptor.UserServiceInterceptor;
import binary.wz.spring.beans.aop.service.IUserService;
import binary.wz.spring.beans.aop.service.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author binarywz
 * @date 2022/3/1 23:11
 * @description:
 */
public class AopTest {

    @Test
    public void testAop() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* binary.wz.spring.beans.aop.service.IUserService.*(..))");

        Class<UserService> clazz = UserService.class;
        Method method = clazz.getDeclaredMethod("queryUserInfo");

        System.out.println(pointcut.matches(clazz));
        System.out.println(pointcut.matches(method, clazz));
    }

    @Test
    public void testDynamic() {
        // 目标对象
        IUserService userService = new UserService();
        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* binary.wz.spring.beans.aop.service.IUserService.*(..))"));

        // 代理对象(JdkDynamicAopProxy)
        IUserService jdkProxy = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("测试结果: " + jdkProxy.queryUserInfo());

        // 代理对象(Cglib2AopProxy)
        IUserService cglibProxy = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("测试结果: " + cglibProxy.register("花花"));
    }

    @Test
    public void testProxyClass() {
        IUserService userService = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserService.class}, (proxy, method, args) -> "你被代理了！");
        String result = userService.queryUserInfo();
        System.out.println("测试结果: " + result);
    }

    @Test
    public void testProxyMethod() {
        // 目标对象(可以替换成任何的目标对象)
        Object targetObj = new UserService();

        // AOP 代理
        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetObj.getClass().getInterfaces(), new InvocationHandler() {
            // 方法匹配器
            MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* binary.wz.spring.beans.aop.service.IUserService.*(..))");

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methodMatcher.matches(method, targetObj.getClass())) {
                    // 方法拦截器
                    MethodInterceptor methodInterceptor = invocation -> {
                        long start = System.currentTimeMillis();
                        try {
                            return invocation.proceed();
                        } finally {
                            System.out.println("监控 - Begin By AOP");
                            System.out.println("方法名称: " + invocation.getMethod().getName());
                            System.out.println("方法耗时: " + (System.currentTimeMillis() - start) + "ms");
                            System.out.println("监控 - End\r\n");
                        }
                    };
                    // 反射调用
                    return methodInterceptor.invoke(new ReflectiveMethodInvocation(targetObj, method, args));
                }
                return method.invoke(targetObj, args);
            }
        });

        String result = proxy.queryUserInfo();
        System.out.println("测试结果: " + result);

    }

}
