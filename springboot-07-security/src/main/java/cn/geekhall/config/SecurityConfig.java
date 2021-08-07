package cn.geekhall.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * SecurityConfig.java
 * AOP
 * @author yiny
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception{
        // 首页所有人可以访问，功能页只有对应的人可以访问、
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/vip1/**").hasRole("vip1")
                .antMatchers("/vip2/**").hasRole("vip2")
                .antMatchers("/vip3/**").hasRole("vip3");
        // 登录
        http.formLogin();

        // 注销
        http.logout().logoutSuccessUrl("/");
    }

    // SpringSecurity 5.0+增加了很多加密方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        auth.inMemoryAuthentication()
                .withUser("moonwhite").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3")
                .and()
                .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");

    }
}
