package binary.wz.spring.beans.auto.apply;

import binary.wz.spring.beans.auto.apply.service.IUserService;
import binary.wz.spring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author binarywz
 * @date 2022/3/8 0:05
 * @description:
 */
public class AutoApplyTest {

    @Test
    public void testAutoApply() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-apply.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果: " + userService.queryUserInfo());
    }

}
