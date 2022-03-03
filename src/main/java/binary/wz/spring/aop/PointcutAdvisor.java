package binary.wz.spring.aop;

/**
 * @author binarywz
 * @date 2022/3/2 23:53
 * @description: 承担了Pointcut和Advice的组合，Pointcut用于获取JointPoint，
 * 而Advice决定JoinPoint执行什么操作
 * Superinterface for all Advisors that are driven by a pointcut.
 * This covers nearly all advisors except introduction advisors,
 * for which method-level matching doesn't apply.
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
