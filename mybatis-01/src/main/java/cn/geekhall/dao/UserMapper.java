package cn.geekhall.dao;

import cn.geekhall.pojo.User;

import java.util.List;

/**
 * UserMapper.java
 *
 * @author yiny
 */
public interface UserMapper {
    // 获取所有用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // 插入用户
    int addUser(User user);

    // 更新/修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
