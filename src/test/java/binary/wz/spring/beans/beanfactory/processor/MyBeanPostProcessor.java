package binary.wz.spring.beans.beanfactory.processor;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.config.BeanPostProcessor;
import binary.wz.spring.beans.beanfactory.service.UserService;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为: 北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
