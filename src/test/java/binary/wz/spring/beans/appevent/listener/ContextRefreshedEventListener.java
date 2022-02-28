package binary.wz.spring.beans.appevent.listener;

import binary.wz.spring.context.ApplicationListener;
import binary.wz.spring.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件: " + this.getClass().getName());
    }

}
