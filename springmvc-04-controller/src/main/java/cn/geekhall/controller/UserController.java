package cn.geekhall.controller;

import cn.geekhall.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserController.java
 *
 * @author yiny
 */
@Controller
@RequestMapping("/user")
public class UserController {


    // http://localhost:8080/springmvc_04_controller/user/t1?username=%E6%9E%81%E5%AE%A2%E5%A0%82
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        // 1. 接收前端参数
        System.out.println("接收的前端参数：" + name);

        // 2. 将返回的结果传递给前端， Model
        model.addAttribute("msg", name);

        // 3。 视图跳转
        return "test";
    }

    // http://localhost:8080/springmvc_04_controller/user/t2?id=1&name=King&age=18
    // 接收一个对象: id, name, age
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }


    /**
     *  ModelMap 继承了LinkedHashMap，所以它拥有LinkedHashMap的全部功能，
     *  LinkedHashMap继承自HashMap，同时还维护了一个双向链表。
     * @param modelMap
     * @return
     */
    @GetMapping("/t3")
    public String test3(ModelMap modelMap){

        return "jsontest";
    }

}
