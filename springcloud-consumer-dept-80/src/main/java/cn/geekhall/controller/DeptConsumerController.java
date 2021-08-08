package cn.geekhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * DeptConsumerController.java
 *
 * @author yiny
 */
@Controller
public class DeptConsumerController {

    // 理解： 消费者不应该有Service层
    // RestFul ，使用RestTemplate

    @Autowired
    private RestTemplate restTemplate;

    
}
