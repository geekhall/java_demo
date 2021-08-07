package cn.geekhall.controller;

import cn.geekhall.bean.User;
import cn.geekhall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController.java
 *
 * @author yiny
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @RequestMapping("/getUserById/{id}")
    User getUserById(@PathVariable int id){
        return userMapper.getUserById(id);
    }

    @GetMapping("/addUser")
    int addUser(User user){
        return userMapper.addUser(user);
    }

    @GetMapping("/updateUser")
    int updateUser(User user){
        return userMapper.updateUser(user);
    }

    @GetMapping("/deleteUser/{id}")
    int deleteUser(@PathVariable int id){
        return userMapper.deleteUser(id);
    }
}
