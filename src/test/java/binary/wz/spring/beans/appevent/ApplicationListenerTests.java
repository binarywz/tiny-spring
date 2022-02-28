package binary.wz.spring.beans.appevent;

import binary.wz.spring.beans.appevent.event.CustomEvent;
import binary.wz.spring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author binarywz
 * @date 2022/2/28 23:24
 * @description:
 */
public class ApplicationListenerTests {

    @Test
    public void testEvent() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-listener.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了!"));

        applicationContext.registerShutdownHook();
    }

}
