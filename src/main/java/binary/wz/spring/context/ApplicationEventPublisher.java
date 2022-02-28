package binary.wz.spring.context;

/**
 * @author binarywz
 * @date 2022/2/28 23:05
 * @description: 事件发布者接口
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for ApplicationContext.
 */
public interface ApplicationEventPublisher {
    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
