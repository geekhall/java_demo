package cn.geekhall.bean;

import cn.geekhall.dao.UserMapper;
import cn.geekhall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * UserTest.java
 *
 * @author yiny
 */
public class UserTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        System.out.println("===============================");
        User user1 = mapper.getUserById(1);
        System.out.println(user1);

        sqlSession.clearCache();
        System.out.println("===============================");
        User user2 = mapper.getUserById(1);
        System.out.println(user2);

        System.out.println("===============================");
        User user3 = mapper.getUserById(2);
        System.out.println(user3);
        sqlSession.close();
    }

    @Test
    public void cacheTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        sqlSession.close();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);


        User user1 = mapper.getUserById(1);
        System.out.println(user1);

        User user2 = mapper2.getUserById(1);
        System.out.println(user2);

        sqlSession.close();
        sqlSession2.close();
    }
}
