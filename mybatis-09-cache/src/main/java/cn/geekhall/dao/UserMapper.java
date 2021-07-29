package cn.geekhall.dao;

import cn.geekhall.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper.java
 *
 * @author yiny
 */
public interface UserMapper {

    User getUserById(@Param("id") int id);
}
