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
        //
//        UserDao userdao = sqlSession.getMapper(UserDao.class);
//        List<User> userList = userdao.getUserList();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList =mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }




        sqlSession.close();
    }
}
