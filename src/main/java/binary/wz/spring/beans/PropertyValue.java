package binary.wz.spring.beans;

/**
 * @author binarywz
 * @date 2022/2/18 23:01
 * @description:
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
