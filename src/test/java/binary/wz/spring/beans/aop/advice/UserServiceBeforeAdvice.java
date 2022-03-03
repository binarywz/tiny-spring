package binary.wz.spring.beans.aop.advice;

import binary.wz.spring.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author binarywz
 * @date 2022/3/3 23:58
 * @description:
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法: " + method.getName());
    }
}
