package binary.wz.spring.beans.factorybean.proxy;

import binary.wz.spring.beans.factory.FactoryBean;
import binary.wz.spring.beans.factorybean.dao.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binarywz
 * @date 2022/2/27 21:58
 * @description:
 */
public class ProxyBeanFactory implements FactoryBean<IUserDao> {
    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = ((proxy, method, args) -> {
            // 添加排除方法
            if ("toString".equals(method.getName())) return this.toString();

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "binarywz");
            hashMap.put("10002", "lebron");
            hashMap.put("10003", "currey");

            return "你被代理了 " + method.getName() + ": " + hashMap.get(args[0].toString());
        });
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
