package binary.wz.spring.beans.factory.support;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.core.io.Resource;
import binary.wz.spring.core.io.ResourceLoader;

/**
 * @author binarywz
 * @date 2022/2/19 23:03
 * @description: Simple interface for bean definition readers
 * getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，
 * 这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
