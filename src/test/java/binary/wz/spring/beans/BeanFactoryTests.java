package binary.wz.spring.beans;

import binary.wz.spring.beans.service.UserService;
import binary.wz.spring.beans.factory.config.BeanDefinition;
import binary.wz.spring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binarywz
 * @date 2022/2/16 0:01
 * @description:
 */
public class BeanFactoryTests {
    @Test
    public void testBeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService singletonUserService = (UserService) beanFactory.getSingleton("userService");
        singletonUserService.queryUserInfo();

        Assert.assertSame(userService, singletonUserService);
    }
}
