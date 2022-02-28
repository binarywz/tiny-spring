package binary.wz.spring.beans.factory.config;

/**
 * @author binarywz
 * @date 2022/2/15 0:18
 * @description: 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
