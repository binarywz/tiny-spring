package binary.wz.spring.context.event;

/**
 * @author binarywz
 * @date 2022/2/28 22:42
 * @description: 监听刷新动作
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
