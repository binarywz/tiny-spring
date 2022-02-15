package binary.wz.spring.beans;

/**
 * @author binarywz
 * @date 2022/2/15 23:48
 * @description: 定义Bean异常
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
