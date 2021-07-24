package cn.geekhall.pojo;

import cn.geekhall.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AppConfTest.java
 *
 * @author yiny
 */
public class AppConfTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("user");

        System.out.println(user);

    }
}
