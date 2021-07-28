package cn.geekhall.dao;

import cn.geekhall.bean.User;
import cn.geekhall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        List<User> users = mapper.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getUserById(1);
        System.out.println(user1);
        sqlSession.close();
    }

    @Test
    public void insertUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(4, "KKK", "123123");
        int res  = mapper.insertUser(user1);
        if (res > 0 ){
            System.out.println("插入成功！");
        }
        sqlSession.close();
    }

    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(4, "oooKKK", "123123123");
        int res = mapper.updateUser(user1);
        if (res > 0 ){
            System.out.println("更新成功！");
        }
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res  = mapper.deleteUser(4);
        if (res > 0 ){
            System.out.println("删除成功！");
        }
        sqlSession.close();
    }

}
