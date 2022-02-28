package binary.wz.spring.beans.appevent.listener;

import binary.wz.spring.context.ApplicationListener;
import binary.wz.spring.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件: " + this.getClass().getName());
    }

}
