package cn.geekhall.controller;

import cn.geekhall.bean.Dept;
import cn.geekhall.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * FeignConsumerController.java
 *
 * @author yiny
 */
public class FeignConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.queryAll();
    }
}
