package cn.geekhall.controller;

import cn.geekhall.bean.Dept;
import cn.geekhall.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @PostMapping("/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return deptService.getDeptbyId(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> getDepts(){
        return deptService.getDepts();
    }
}
