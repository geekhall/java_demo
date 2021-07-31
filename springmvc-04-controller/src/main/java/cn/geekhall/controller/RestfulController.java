package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * RestfulController.java
 *
 * @author yiny
 */
@Controller
public class RestfulController {

    // http://localhost:8080/springmvc_04_controller/add?a=1&b=2
    @RequestMapping("/add")
    public String add(int a, int b, Model model){
        int res = a + b;

        model.addAttribute("msg", "add method result :" + res);
        return "test";
    }


    // http://localhost:8080/springmvc_04_controller/restful_add/1/2
    @RequestMapping("/restful_add/{a}/{b}")
    public String restful_add(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;

        model.addAttribute("msg", "restful add method result :" + res);
        return "test";
    }

    // http://localhost:8080/springmvc_04_controller/restful_add_str/1/2   限定只能通过GET方法访问，POST会报404，等同于@GetMapping

//    @RequestMapping(name="/restful_add_str/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/restful_add_str/{a}/{b}")
    public String restful_add(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;

        model.addAttribute("msg", "restful String add method result :" + res);
        return "test";
    }


    // http://localhost:8080/springmvc_04_controller/test_post_get/1/3
    // 相同的URL使用Post或者Get方法来访问，会进到下面不同的函数中。
    // 注意需要使用@PathVariable 来声明使用位置变量，否则会报500错误。
    @PostMapping("/test_post_get/{a}/{b}")
    public String test_post(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "post method result :" + res);
        return "test";
    }

    @GetMapping("/test_post_get/{a}/{b}")
    public String test_get(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "get method result :" + res);
        return "test";
    }



}
