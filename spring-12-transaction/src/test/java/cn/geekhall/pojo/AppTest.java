package cn.geekhall.pojo;

import cn.geekhall.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * AppTest.java
 *
 * @author yiny
 */
public class AppTest {

    @Test
    public void test() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }

        UserMapper userMapper2 = context.getBean("userMapper2", UserMapper.class);
        List<User> users2 = userMapper2.getUsers();

        for (User user : users2) {
            System.out.println(user);
        }
    }
}
