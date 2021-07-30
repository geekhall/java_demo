package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController3.java
 *
 * @author yiny
 */
@Controller
@RequestMapping("/c3")
public class TestController3 {

    // http://localhost:8080/springmvc_04_controller/c3/t1
    @RequestMapping("/t1")
    public String test3(Model model){
        model.addAttribute("msg", "TestController3");
        return "test";
    }
}
