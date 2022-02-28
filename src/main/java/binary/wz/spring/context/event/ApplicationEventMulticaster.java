package binary.wz.spring.context.event;

import binary.wz.spring.context.ApplicationEvent;
import binary.wz.spring.context.ApplicationListener;

/**
 * @author binarywz
 * @date 2022/2/28 22:45
 * @description: 事件广播器，定义了添加监听和删除监听的方法以及一个广播事件的方法
 * multicastEvent（最终推送时间消息也会经过这个接口方法来处理谁该接收事件）
 * Interface to be implemented by objects that can manage a number of
 * {@link ApplicationListener} objects, and publish events to them.
 */
public interface ApplicationEventMulticaster {
    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
