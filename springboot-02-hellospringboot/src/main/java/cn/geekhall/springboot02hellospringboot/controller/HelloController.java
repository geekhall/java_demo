package cn.geekhall.springboot02hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController.java
 *
 * @author yiny
 */
@RestController
public class HelloController {

    // http://localhost:8080/hello

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring boot!";
    }
}
