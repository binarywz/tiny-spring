package binary.wz.spring.beans.factory;

import binary.wz.spring.beans.BeansException;

/**
 * @author binarywz
 * @date 2022/2/15 0:06
 * @description: Bean工厂
 */
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args) throws BeansException;

}
