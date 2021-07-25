package cn.geekhall.mapper;

import cn.geekhall.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    int addUser(User user);

    int deleteUser(int id);
}
