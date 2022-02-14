package binary.wz.spring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author binarywz
 * @date 2022/2/15 0:06
 * @description: Bean工厂
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
