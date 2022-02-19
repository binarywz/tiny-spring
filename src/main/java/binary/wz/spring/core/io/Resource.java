package binary.wz.spring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author binarywz
 * @date 2022/2/19 22:42
 * @description: 处理资源加载流
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
