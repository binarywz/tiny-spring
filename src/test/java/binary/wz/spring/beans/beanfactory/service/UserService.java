package binary.wz.spring.beans.beanfactory.service;

import binary.wz.spring.beans.beanfactory.dao.UserDao;
import binary.wz.spring.beans.factory.DisposableBean;
import binary.wz.spring.beans.factory.InitializingBean;

/**
 * @author binarywz
 * @date 2022/2/16 0:01
 * @description:
 */
public class UserService implements InitializingBean, DisposableBean {

    private String userId;
    private String company;
    private String location;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(userId) + ", " + company + ", " + location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行: UserService.afterPropertiesSet");
    }
}
