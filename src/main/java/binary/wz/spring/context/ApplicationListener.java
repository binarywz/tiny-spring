package binary.wz.spring.context;

import java.util.EventListener;

/**
 * @author binarywz
 * @date 2022/2/28 22:45
 * @description: Interface to be implemented by application event listeners.
 * Based on the standard <code>java.util.EventListener</code> interface
 * for the Observer design pattern.
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);
}
