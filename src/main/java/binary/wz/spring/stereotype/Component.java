package binary.wz.spring.stereotype;

import java.lang.annotation.*;

/**
 * @author binarywz
 * @date 2022/3/6 14:45
 * @description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
