package binary.wz.spring.context;

import java.util.EventObject;

/**
 * @author binarywz
 * @date 2022/2/28 22:37
 * @description: Class to be extended by all application events. Abstract as it
 * doesn't make sense for generic events to be published directly.
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
