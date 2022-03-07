package binary.wz.spring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author binarywz
 * @date 2022/3/7 23:05
 * @description:
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}
