package binary.wz.spring.beans.factory;

/**
 * @author binarywz
 * @date 2022/2/26 22:28
 * @description: 实现此接口，即能感知（获取）到所属的BeanName
 * Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
