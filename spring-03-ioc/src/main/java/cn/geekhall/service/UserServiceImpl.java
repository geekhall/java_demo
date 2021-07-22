package cn.geekhall.service;

import cn.geekhall.dao.UserDao;

/**
 * UserServiceImpl.java
 *
 * @author yiny
 */
public class UserServiceImpl implements UserService {

    // 写死的话，当用户需求或者数据库发生变更时需要修改代码。
//    UserDao userDao = new UserDaoImpl();
//    UserDao userDao = new UserDaoMysqlImpl();
//    UserDao userDao = new UserDaoOracleImpl();

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;


    public void getUser() {
        userDao.getUser();
    }
}
