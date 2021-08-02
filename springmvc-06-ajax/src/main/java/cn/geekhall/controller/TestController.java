package cn.geekhall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController.java
 *
 * @author yiny
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("TestController ===> test() 执行了");
        return "OK";
    }
}
