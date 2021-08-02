package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * LoginController.java
 *
 * @author yiny
 */
@Controller
@RequestMapping("/user")
public class LoginController {


    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        System.out.println("login ===> " + username);

        // 把用户的信息存在session中。
        session.setAttribute("userLoginInfo", username);

        model.addAttribute("username", username);

        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session, String username, String password, Model model) {
        System.out.println("goOut ====> " + username);

        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
