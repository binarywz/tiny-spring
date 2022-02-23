package binary.wz.spring.beans.factory.support;

import binary.wz.spring.core.io.DefaultResourceLoader;
import binary.wz.spring.core.io.ResourceLoader;

/**
 * @author binarywz
 * @date 2022/2/19 23:05
 * @description: 抽象类把 BeanDefinitionReader 接口的前两个方法全部实现完了，并提供了构造函数,
 * 让外部的调用使用方，把Bean定义注入类，传递进来。这样在接口 BeanDefinitionReader 的具体实现类中，
 * 就可以把解析后的 XML 文件中的 Bean 信息，注册到 Spring 容器去了。
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}