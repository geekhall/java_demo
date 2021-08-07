package cn.geekhall.controller;

import cn.geekhall.bean.User;
import cn.geekhall.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController.java
 *
 * @author yiny
 */
@Api(tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {


    @ApiOperation("使用ID获取用户")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) throws Exception{
        return new User();
    }
}