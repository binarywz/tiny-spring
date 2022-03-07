package binary.wz.spring.util;

/**
 * @author binarywz
 * @date 2022/3/7 22:48
 * @description: 解析字符串操作
 * Simple strategy interface for resolving a String value.
 * Used by {@link binary.wz.spring.beans.factory.config.ConfigurableBeanFactory}.
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}
