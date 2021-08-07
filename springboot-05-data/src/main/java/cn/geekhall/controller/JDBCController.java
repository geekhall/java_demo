package cn.geekhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * JDBCController.java
 *
 * @author yiny
 */
@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    // 查询数据库的所有信息

    // http://localhost:8080/userList
    // [{"id":1,"name":"king","pwd":"*23AE809DDACAF96AF0FD78ED04B6A265E05AA257"},
    // {"id":2,"name":"Ares","pwd":"*6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9"},
    // {"id":3,"name":"GeekHall","pwd":"*6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9"},
    // {"id":4,"name":"KKK","pwd":"123123"}]
    @RequestMapping("/userList")
    public List<Map<String, Object>> userList(){
        String sql = "select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }

    @RequestMapping("/addUser")
    public String addUser(){
        String sql = "insert into mybatis.user(id, name, pwd) values (5, '老王', '123456')";
        jdbcTemplate.update(sql);
        return "insert ok";
    }

    @RequestMapping("/delUser/{id}")
    public String delUser(@PathVariable int id){
//        String sql = "delete from mybatis.user where id = " + id;
//        jdbcTemplate.execute(sql);
        String sql = "delete from mybatis.user where id = ?";
        jdbcTemplate.update(sql, id);

        return "delete ok";
    }

    @RequestMapping("/updateUser/{id}")
    public String updateUser(@PathVariable int id){
        String sql = "update mybatis.user set name=?, pwd=? where id=" + id;

        // 封装
        Object[] objects = new Object[2];
        objects[0] = "小张";
        objects[1] = "zzzzzz";
        jdbcTemplate.update(sql, objects);
        return "update ok";
    }


}
