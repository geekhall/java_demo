package cn.geekhall.boot.configuration;

import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

/**
 * AdpSpringConfiguration.java
 *
 * @author yiny
 */
@Configuration
public class AdpSpringConfiguration {
    @Inject
    public void setAdpSpringConfiguration(){
        System.out.println("==========================================");
        System.out.println("AdpSpringConfiguration 执行了");
        System.out.println("==========================================");
    }
}
