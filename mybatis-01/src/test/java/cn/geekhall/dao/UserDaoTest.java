package cn.geekhall.dao;

import cn.geekhall.pojo.User;
import cn.geekhall.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * UserDaoTest.java
 *
 * @author yiny
 */

public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式1 ：
//        UserDao userdao = sqlSession.getMapper(UserDao.class);
//        List<User> userList = userdao.getUserList();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList =mapper.getUserList();

        // 方式二：老的模式，不推荐使用。
//        List<User> userList = sqlSession.selectList("cn.geekhall.dao.UserMapper.getUserList");
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(5, "哈哈", "123"));
        if (res > 0) {
            System.out.println("插入成功!");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(5, "呵呵", "456"));
        if (res > 0) {
            System.out.println("更新成功!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        if (mapper.deleteUser(5) > 0) {
            System.out.println("删除成功!");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
