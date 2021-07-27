package cn.geekhall.dao;

import cn.geekhall.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * UserMapper.java
 *
 * @author yiny
 */
public interface UserMapper {
    // 获取所有用户
    @Select("select * from user")
    List<User> getUserList();


    // 若方法存在多个参数，则所有的参数前都需要加上@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user (id, name, pwd) values (#{id},#{name}, #{pwd})")
    int insertUser(User user );

    @Update("update user set name=#{name}, pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id= #{uid}")
    int deleteUser(@Param("uid") int id);
}
