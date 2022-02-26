package binary.wz.spring.beans.factory;

/**
 * @author binarywz
 * @date 2022/2/26 22:19
 * @description: 类标记接口，实现该接口可以被Spring感知
 * Spring中有很多类似Aware的标记接口，它们的存在就像是一种标签一样，可以
 * 方便统一摘取出属于此类接口的实现类，通常配合instanceof一起判断使用
 * Marker superinterface indicating that a bean is eligible to be
 * notified by the Spring container of a particular framework object
 * through a callback-style method.  Actual method signature is
 * determined by individual subinterfaces, but should typically
 * consist of just one void-returning method that accepts a single
 * argument.
 */
public interface Aware {
}
