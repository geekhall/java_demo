package cn.geekhall.mapper;

import cn.geekhall.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * UserMapperImpl.java
 *
 * @author yiny
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUsers() {
        User user = new User("4", "极客堂", "123456");
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        userMapper.addUser(user);
        userMapper.deleteUser(4);
//        return getSqlSession().getMapper(UserMapper.class).getUsers();
        return userMapper.getUsers();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
