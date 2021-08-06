package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * HelloController.java
 *
 * @author yiny
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "GeekHall");
        model.addAttribute("utext", "<h2 style='color:red'>GeekHall</h2>");
        model.addAttribute("users", Arrays.asList("Geek", "Hall"));

        return "hello";
    }
}
