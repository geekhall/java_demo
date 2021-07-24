package cn.geekhall.pojo;

import cn.geekhall.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AppTest3.java
 *
 * @author yiny
 */
public class AppTest3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
        userService.update();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
        userService.delete();

    }
}
