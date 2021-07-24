package cn.geekhall.mapper;

import cn.geekhall.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * UserMapperImpl.java
 *
 * @author yiny
 */
public class UserMapperImpl implements UserMapper {

    // 我们的所有操作，都使用sqlSession来执行，在原来，现在都使用SqlSessionTemplate。
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
