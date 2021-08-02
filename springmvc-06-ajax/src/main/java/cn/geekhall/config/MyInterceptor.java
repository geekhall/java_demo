package cn.geekhall.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * MyInterceptor.java
 *
 * @author yiny
 */
public class MyInterceptor implements HandlerInterceptor {

    // return true  ： 执行下一个拦截器，放行。
    // return false :  不执行下一个拦截器，拦住。
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==================  处理前 ==================");

        HttpSession session = request.getSession();
        // 判断什么情况下没有登录
        if (request.getRequestURI().contains("Login")) {
            return true;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==================  处理后 ==================");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("==================  清理 ==================");
    }
}
