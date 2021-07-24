package cn.geekhall.config;

import cn.geekhall.pojo.User;
import cn.geekhall.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig.java
 *
 * @author yiny
 */
@Configuration
public class AppConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
