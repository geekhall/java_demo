package cn.geekhall.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * UserServiceImpl.java
 *
 * @author yiny
 */
@Service    // 可以被扫描到，在项目一启动就自动注册到注册中心
@Component  //使用了Dubbo后尽量不要用Service注解
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "Hi geek!";
    }
}
