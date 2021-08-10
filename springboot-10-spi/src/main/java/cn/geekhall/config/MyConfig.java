package cn.geekhall.config;

import cn.geekhall.init.SystemInit;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * MyConfig.java
 *
 * @author yiny
 */
@Configuration
@ConditionalOnClass(SystemInit.class)
public class MyConfig {

    public SystemInit systemInit(){
        return new SystemInit();
    }
}
