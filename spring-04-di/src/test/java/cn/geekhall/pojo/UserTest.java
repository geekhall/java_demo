package cn.geekhall.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserTest.java
 *
 * @author yiny
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

        User user2 = (User) context.getBean("user2");
        System.out.println(user2);
    }
}
