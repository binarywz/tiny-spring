package binary.wz.spring.core.io;

/**
 * @author binarywz
 * @date 2022/2/19 22:55
 * @description: 获取资源接口
 */
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
