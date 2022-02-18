package binary.wz.spring.beans.factory.config;

/**
 * @author binarywz
 * @date 2022/2/18 23:05
 * @description: Bean的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
