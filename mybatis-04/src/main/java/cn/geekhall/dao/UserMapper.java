package cn.geekhall.dao;

import cn.geekhall.bean.User;

import java.util.List;
import java.util.Map;

/**
 * UserMapper.java
 *
 * @author yiny
 */
public interface UserMapper {
    // 获取所有用户
    List<User> getUserList();

    // 模糊查询
    List<User> getUserLike(String value);

    // 根据ID查询用户
    User getUserById(int id);

    // 插入用户
    int addUser(User user);
    // 使用map传递参数，直接在sql中取出key即可
    int addUser2(Map<String, Object> user);


    // 更新/修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
