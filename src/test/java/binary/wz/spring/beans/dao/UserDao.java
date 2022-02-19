package binary.wz.spring.beans.dao;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "binarywz");
        hashMap.put("10002", "Lebron");
        hashMap.put("10003", "Kobe");
    }

    public String queryUserName(String userId) {
        return hashMap.get(userId);
    }

}