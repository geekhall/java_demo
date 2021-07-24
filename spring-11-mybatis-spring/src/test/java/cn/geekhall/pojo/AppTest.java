package cn.geekhall.pojo;

import cn.geekhall.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * AppTest.java
 *
 * @author yiny
 */
public class AppTest {

    @Test
    public void test() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUsers();
//
//        for (User user : userList) {
//            System.out.println(user);
//        }

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }

    }
}
