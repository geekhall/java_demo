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
        // 如果完全使用配置类来编码，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类来获取class对象加载。
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 注意这里不可以写成user，而要写成方法名getUser。否则会找不到。
        User user = (User) context.getBean("getUser");
        System.out.println(user);
    }
}
