package binary.wz.spring.context.annotation;

import java.lang.annotation.*;

/**
 * @author binarywz
 * @date 2022/3/6 14:42
 * @description: 配置作用域的自定义注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}
