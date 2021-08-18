package cn.geekhall.config;

import cn.geekhall.init.SystemInit;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * MyConfig.java
 *
 * @author yiny
 */
//@Configuration
//@ConditionalOnClass(SystemInit.class)
@Component
public class MyConfig implements IMyConfig{

    public MyConfig(){
        System.out.println("MyConfig Constructor ");
    }
    @Inject
    @Override
    public void systemInit(){
        System.out.println("MyConfig Method.... ");
    }
}
