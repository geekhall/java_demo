package cn.geekhall.dao;

import cn.geekhall.bean.User;

import java.util.List;

/**
 * UserDao.java
 *
 * @author yiny
 */
public interface UserDao {
    List<User> getUserList();
}
