package binary.wz.spring.beans.aop.service;

import java.util.Random;

/**
 * @author binarywz
 * @date 2022/3/1 23:11
 * @description:
 */
public class UserService implements IUserService {

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "binarywz，100001，成都";
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "binarywz: " + userName + " success！";
    }

}
