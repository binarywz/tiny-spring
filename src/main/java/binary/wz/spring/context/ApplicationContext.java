package binary.wz.spring.context;

import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.beans.factory.ListableBeanFactory;

/**
 * @author binarywz
 * @date 2022/2/22 23:32
 * @description: 应用上下文
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 */
public interface ApplicationContext extends ListableBeanFactory {
}