package binary.wz.spring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author binarywz
 * @date 2022/3/7 23:06
 * @description: 注入属性
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * The actual value expression: e.g. "#{systemProperties.myProp}".
     */
    String value();

}
