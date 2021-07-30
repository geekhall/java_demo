package cn.geekhall.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloController.java
 *
 * @author yiny
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ModelAndView 视图
        ModelAndView mv = new ModelAndView();

        // 封装对象，放在ModelAndView中，Model
        mv.addObject("msg", "HelloSpringMVC!");

        // 封装要跳转的视图，放在ModelAndView。
        mv.setViewName("Hello"); // : /WEB-INF/jsp/hello.jsp
        return mv;
    }
}
