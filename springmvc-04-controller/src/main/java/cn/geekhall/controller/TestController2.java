package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController2.java
 *
 * @author yiny
 */
@Controller
public class TestController2 {

    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg", "TestController2");
        return "test2";
    }

    @RequestMapping("/t2")
    public String t2(Model model){
        model.addAttribute("msg", "TestControllerT2");
        return "test2";    // /t2 与/test2共用一个test2.jsp页面
    }

}
