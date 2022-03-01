package binary.wz.spring.aop;

import java.lang.reflect.Method;

/**
 * @author binarywz
 * @date 2022/3/1 23:18
 * @description: 方法匹配接口，找到表达式范围内匹配下的目标类和方法
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);

}
