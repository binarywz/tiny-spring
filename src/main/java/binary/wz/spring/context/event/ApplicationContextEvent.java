package binary.wz.spring.context.event;

import binary.wz.spring.context.ApplicationContext;
import binary.wz.spring.context.ApplicationEvent;

/**
 * @author binarywz
 * @date 2022/2/28 22:38
 * @description: Base class for events raised for an <code>ApplicationContext</code>.
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     * 获取事件对应的ApplicationContext
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
