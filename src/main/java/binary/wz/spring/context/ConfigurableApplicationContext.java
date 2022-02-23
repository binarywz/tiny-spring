package binary.wz.spring.context;

import binary.wz.spring.beans.BeansException;

/**
 * @author binarywz
 * @date 2022/2/22 23:33
 * @description:
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
