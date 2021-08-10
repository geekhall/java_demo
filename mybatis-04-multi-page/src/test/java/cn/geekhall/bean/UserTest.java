package cn.geekhall.bean;

import cn.geekhall.dao.UserMapper;
import cn.geekhall.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

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
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserByLimitTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByRowBoundsTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 通过Java代码RowBounds方式实现分页，不推荐使用。
        RowBounds rowBounds = new RowBounds(1,2);
        List<User> users = sqlSession.selectList("cn.geekhall.dao.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
