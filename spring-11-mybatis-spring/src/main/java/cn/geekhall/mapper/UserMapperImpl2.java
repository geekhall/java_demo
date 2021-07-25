package cn.geekhall.mapper;

import cn.geekhall.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * UserMapperImpl2.java
 *
 * @author yiny
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> getUsers() {
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.getUsers();
        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }
}
