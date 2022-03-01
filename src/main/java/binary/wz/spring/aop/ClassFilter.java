package binary.wz.spring.aop;

/**
 * @author binarywz
 * @date 2022/3/1 23:19
 * @description: 类匹配接口，用于切点找到给定的接口和目标类
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 */
public interface ClassFilter {

    /**
     * Should the pointcut apply to the given interface or target class?
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);

}
