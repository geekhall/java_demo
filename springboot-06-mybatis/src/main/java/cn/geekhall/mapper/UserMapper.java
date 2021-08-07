package cn.geekhall.mapper;

import cn.geekhall.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserMapper.java
 *
 * @author yiny
 */
@Mapper  // 这个注解表示这是一个MyBatis的Mapper类；
@Repository
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id) ;

}
