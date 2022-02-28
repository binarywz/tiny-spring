package binary.wz.spring.context.event;

import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.context.ApplicationEvent;
import binary.wz.spring.context.ApplicationListener;

/**
 * @author binarywz
 * @date 2022/2/28 23:07
 * @description:
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
