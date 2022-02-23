package binary.wz.spring.context.support;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.ConfigurableListableBeanFactory;
import binary.wz.spring.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author binarywz
 * @date 2022/2/22 23:56
 * @description: 在 refreshBeanFactory() 中主要是获取了 DefaultListableBeanFactory 的实例化以及对资源配置的加载操作 loadBeanDefinitions(beanFactory)，
 * 在加载完成后即可完成对 spring.xml 配置文件中 Bean 对象的定义和注册，同时也包括实现了接口 BeanFactoryPostProcessor、BeanPostProcessor 的配置 Bean 信息。
 * 但此时资源加载还只是定义了一个抽象类方法 loadBeanDefinitions(DefaultListableBeanFactory beanFactory)，继续由其他抽象类继承实现。
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
