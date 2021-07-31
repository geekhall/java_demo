package cn.geekhall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ModelTest1.java
 *
 * @author yiny
 */
@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test(HttpServletRequest req, HttpServletResponse resp ){
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        // 若没有配置视图解析器，可以使用下面几种方式来转发找到视图。
        // 方式1：
//        return "/WEB-INF/jsp/test.jsp";

        // 方式2：
//        return "forward:/WEB-INF/jsp/test.jsp";

        // 方式3：重定向（有视图解析起也相同）
//        return "redirect:test.jsp";

        return "test";
    }
}
