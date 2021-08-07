package cn.geekhall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * MyMvcConfig.java
 * 扩展SpringMVCS视图解析器
 * @author yiny
 */
@Configuration
//@EnableWebMvc   // 这个注解的作用就是导入了DelegatingWebMvcConfiguration，如果想使用扩展SpringMVC，则一定不能添加这个注解！
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送/geekhall，就会跳转到success页面。
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/geekhall").setViewName("success");
    }

    // 实现了视图解析器接口的类，我们就可以把它看作是视图解析器。
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    // 自定义的国际化组件生效
    @Bean
    public LocaleResolver localeresolver(){
        return new MyLocaleResolver();
    }

    public void addInterceptors(InterceptorRegistry registry){

        registry.addInterceptor(                                                        // 添加一个拦截器
                new LoginHandlerInterceptor()).addPathPatterns("/**")                   // 拦截哪些请求
                .excludePathPatterns("index.html", "/", "/user/login","/css/*","/js/**", "/img/**");    // 不拦截的url
    }

    // 自定义一个视图解析器
    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

}
