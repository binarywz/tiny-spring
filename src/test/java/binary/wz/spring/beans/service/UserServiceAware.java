package binary.wz.spring.beans.service;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.dao.UserDao;
import binary.wz.spring.beans.factory.BeanClassLoaderAware;
import binary.wz.spring.beans.factory.BeanFactory;
import binary.wz.spring.beans.factory.BeanFactoryAware;
import binary.wz.spring.beans.factory.BeanNameAware;
import binary.wz.spring.context.ApplicationContext;
import binary.wz.spring.context.ApplicationContextAware;

/**
 * @author binarywz
 * @date 2022/2/26 23:03
 * @description:
 */
public class UserServiceAware implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

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
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader: " + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
