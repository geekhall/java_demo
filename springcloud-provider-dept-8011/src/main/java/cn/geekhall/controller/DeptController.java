package cn.geekhall.controller;

import cn.geekhall.bean.Dept;
import cn.geekhall.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DeptController.java
 *
 * @author yiny
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id) {
        return deptService.getDeptbyId(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> getDepts() {
        return deptService.getDepts();
    }

    // 注册进来的微服务，获取一些消息
    // http://localhost:8011/dept/discovery
    // 获取到：{"discoveryClients":[{"order":0,"services":["springcloud-provider-dept"]},{"order":0,"services":[]}],"services":["springcloud-provider-dept"],"order":0}
    @RequestMapping("/dept/discovery")
    public Object discovery() {
        // 获取微服务列表的清单
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery ===> " + services);

        // 得到一个具体的微服务信息，通过具体的微服务ID，applicationName
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-provider-dept");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t" + instance.getPort()
                    + "\t" + instance.getUri() + "\t" + instance.getServiceId());
        }

        return this.discoveryClient;
    }
}
