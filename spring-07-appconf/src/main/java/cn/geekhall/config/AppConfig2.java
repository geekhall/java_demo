package cn.geekhall.config;

import cn.geekhall.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * AppConfig2.java
 *
 * @author yiny
 */
@Configuration
@ComponentScan("cn.geekhall.pojo")
@Import(AppConfig2.class)
public class AppConfig2 {
    // 注册一个Bean，就相当于我们之前写的一个bean标签
    // 这个方法的名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User(); // 就是要返回注入到bean的对象！
    }
}
