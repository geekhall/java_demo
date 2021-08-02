package cn.geekhall.controller;

import cn.geekhall.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AjaxController.java
 *
 * @author yiny
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException{
        System.out.println("a1: param ====> " + name);
        if ("gh".equals(name)){
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "Eric", "123"));
        userList.add(new User(2, "King", "123"));
        userList.add(new User(3, "Moon", "123"));
        userList.add(new User(4, "White", "123"));
        return userList;
    }


}
