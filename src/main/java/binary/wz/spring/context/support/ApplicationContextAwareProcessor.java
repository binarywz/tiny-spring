package binary.wz.spring.context.support;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.config.BeanPostProcessor;
import binary.wz.spring.context.ApplicationContext;
import binary.wz.spring.context.ApplicationContextAware;

/**
 * @author binarywz
 * @date 2022/2/26 22:38
 * @description: ApplicationContext的获取并不能直接在创建Bean的时候就可以拿到，需要在refresh操作时
 * 把ApplicationContext写入到一个包装的BeanPostProcessor中去，
 * 再由 AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization 方法调用
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
