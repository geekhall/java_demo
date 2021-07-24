package cn.geekhall.pojo;

import cn.geekhall.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AopTest2.java
 *
 * @author yiny
 */
public class AopTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.update();
        userService.delete();

    }
}
