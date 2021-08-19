package cn.geekhall.controller;

import cn.geekhall.config.MyConfig;
import org.springframework.stereotype.Component;

/**
 * TestController.java
 *
 * @author yiny
 */
@Component
public class TestController {
    public void testConfig(MyConfig myConfig){
        myConfig.systemInit();
    }
}
