package cn.geekhall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * MyConfigB.java
 *
 * @author yiny
 */
@Component
public class MyConfigB implements IMyConfig {
    public MyConfigB(){
        System.out.println("MyConfigB Constructor... ");
    }
    @Override
    @Inject
    public void systemInit() {
        System.out.println("MyConfigB method");
    }
}
