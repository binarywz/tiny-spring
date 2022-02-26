package binary.wz.spring.beans.dao;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行: UserDao.init-method");
        hashMap.put("10001", "binarywz");
        hashMap.put("10002", "lebron");
        hashMap.put("10003", "kobe");
    }

    public void destroyDataMethod() {
        System.out.println("执行: UserDao.destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String userId) {
        return hashMap.get(userId);
    }

}