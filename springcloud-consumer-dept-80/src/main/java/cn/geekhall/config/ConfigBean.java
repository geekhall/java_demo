package cn.geekhall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ConfigBean.java
 *
 * @author yiny
 */
@Configuration
public class ConfigBean { // @Configuration 就相当于 apring 的 applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
