package binary.wz.spring.context.event;

/**
 * @author binarywz
 * @date 2022/2/28 22:41
 * @description: 监听关闭动作
 * Event raised when an <code>ApplicationContext</code> gets closed.
 */
public class ContextClosedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
