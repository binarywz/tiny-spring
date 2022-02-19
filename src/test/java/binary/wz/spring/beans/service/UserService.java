package binary.wz.spring.beans.service;

import binary.wz.spring.beans.dao.UserDao;

/**
 * @author binarywz
 * @date 2022/2/16 0:01
 * @description:
 */
public class UserService {
    private String userId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(userId);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
