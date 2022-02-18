package binary.wz.spring.beans.service;

import binary.wz.spring.beans.dao.UserDao;

/**
 * @author binarywz
 * @date 2022/2/16 0:01
 * @description:
 */
public class UserService {
    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("query user info: {}" + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
