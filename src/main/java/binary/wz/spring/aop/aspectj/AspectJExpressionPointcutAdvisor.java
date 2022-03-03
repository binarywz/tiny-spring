package binary.wz.spring.aop.aspectj;

import binary.wz.spring.aop.Pointcut;
import binary.wz.spring.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @author binarywz
 * @date 2022/3/3 0:01
 * @description: Spring AOP Advisor that can be used for any AspectJ pointcut expression.
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;
    // 具体的拦截方法
    private Advice advice;
    // 表达式
    private String expression;

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

}
