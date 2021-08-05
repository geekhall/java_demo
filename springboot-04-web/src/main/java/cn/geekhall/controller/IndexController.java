package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController.java
 *
 * @author yiny
 */
// 在template目录下的所有页面只能通过Controller来跳转！
// 这个需要模版引擎的支持

@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
