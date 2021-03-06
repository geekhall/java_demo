package cn.geekhall.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * TicketServiceImpl.java
 *
 * @author yiny
 */
@Service    // 可以被扫描到，在项目一启动就自动注册到注册中心
@Component  //使用了Dubbo后尽量不要用Service注解
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        Random random = new Random();
        int i = random.nextInt();
        return "极客堂" + i;
    }
}
