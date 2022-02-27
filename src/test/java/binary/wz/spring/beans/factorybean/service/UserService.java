package binary.wz.spring.beans.factorybean.service;

import binary.wz.spring.beans.factorybean.dao.IUserDao;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public class UserService {

    private String userId;
    private String company;
    private String location;
    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(userId) + "," + company + "," + location;
    }

    public String getuId() {
        return userId;
    }

    public void setuId(String uId) {
        this.userId = uId;
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

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
