package cn.geekhall.controller;

import cn.geekhall.bean.Dept;
import cn.geekhall.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * DeptConsumerController.java
 *
 * @author yiny
 */
@RestController
public class DeptConsumerController {

    // 理解： 消费者不应该有Service层
    // RestFul ，使用RestTemplate，提供多种便捷访问远程http服务的方法，简单的Restful服务模版
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DeptClientService deptClientService;

    // private static final String REST_URL_PREFIX = "http://localhost:8011";

    // 使用 Ribbon 的情况不能使用固定地址，而应该使用Eureka中注册的应用地址：
     private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
