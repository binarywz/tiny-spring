package binary.wz.spring.context;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.factory.Aware;

/**
 * @author binarywz
 * @date 2022/2/26 22:36
 * @description: 实现此接口，即能感知（获取）到所属的ApplicationContext
 * Interface to be implemented by any object that wishes to be notified
 * of the {@link ApplicationContext} that it runs in.
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
