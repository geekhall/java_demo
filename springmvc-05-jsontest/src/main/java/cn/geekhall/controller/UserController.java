package cn.geekhall.controller;

import cn.geekhall.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController.java
 *
 * @author yiny
 */
@Controller
public class UserController {

    // http://localhost:8080/json1
    @RequestMapping("/json1")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json1(){

        // 1。 创建一个对象
        User user  = new User(1, "Geekhall", 18);

        return user.toString();
    }
}
