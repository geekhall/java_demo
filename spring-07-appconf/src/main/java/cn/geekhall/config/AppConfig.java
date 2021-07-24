package cn.geekhall.config;

import cn.geekhall.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig.java
 *
 * @author yiny
 */
// @Configuration也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml一样
@Configuration
public class AppConfig {

    // 注册一个Bean，就相当于我们之前在xml里面配置的一个<bean>标签，
    // 这个方法的名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); //这个就是返回要注入到bean的对象！
    }
}
