package binary.wz.spring.beans;

/**
 * @author binarywz
 * @date 2022/2/15 0:05
 * @description: Bean定义
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
