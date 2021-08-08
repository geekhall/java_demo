package cn.geekhall.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * UserService.java
 *
 * @author yiny
 */
@Service   // 放到容器中
public class UserService {

    // 想拿到provider提供的票，要去注册中心拿到服务
    @Reference(timeout = 30000)    // 引用 ， Pom坐标，可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到 ====> " + ticket);
    }
}
