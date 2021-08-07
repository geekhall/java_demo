package cn.geekhall.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * DruidConfig.java
 *
 * @author yiny
 */
// 因为 SpringBoot 内置了Servlet容器，所以没有Web.xml，替代方法是使用@Bean、@Configuration等方法注册
@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    // 后台监控
    // http://localhost:8080/druid/
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        // 后台要有人登录，账号密码配置
        HashMap<String, String> initParameters = new HashMap<>();
        // 登录Key是固定的loginUsername, loginPassword
        initParameters.put("loginUsername", "admin");
        initParameters.put("loginPassword", "123456");

        // 允许谁可以访问
        initParameters.put("allow", "");

        // 禁止谁访问
        initParameters.put("king", "192.168.11.12");

        bean.setInitParameters(initParameters); //设置初始化参数。
        return bean;
    }

    // filter 自定义过滤器过滤请求
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());

        Map<String, String> initParameters = new HashMap<>();

        // 这些东西不进行统计～
        initParameters.put("exclusions", "*.js,*.css,/druid/*");

        bean.setInitParameters(initParameters);
        return bean;
    }
}
