package cn.geekhall.dao;

import cn.geekhall.pojo.User;
import cn.geekhall.util.MybatisUtils;

import java.util.List;

/**
 * UserDaoImpl.java
 *
 * @author yiny
 */
public class UserDaoImpl implements UserDao {
    public List<User> getUserList() {
        return MybatisUtils.getSqlSession().getMapper(UserMapper.class).getUserList();
    }
}
