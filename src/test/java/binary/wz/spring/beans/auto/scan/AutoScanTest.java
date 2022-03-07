package binary.wz.spring.beans.auto.scan;

import binary.wz.spring.beans.auto.scan.service.IUserService;
import binary.wz.spring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author binarywz
 * @date 2022/3/6 22:37
 * @description:
 */
public class AutoScanTest {

    @Test
    public void testScan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果: " + userService.queryUserInfo());
    }

    @Test
    public void testProperty() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果: " + userService);
    }

}
