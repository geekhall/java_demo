package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    // http://localhost:8080/springmvc_04_controller/restful_add_str/1/2   限定只能通过GET方法访问，POST会报404
    @RequestMapping(name="/restful_add_str/{a}/{b}", method = RequestMethod.GET)
    public String restful_add(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;

        model.addAttribute("msg", "restful String add method result :" + res);
        return "test";
    }

}
