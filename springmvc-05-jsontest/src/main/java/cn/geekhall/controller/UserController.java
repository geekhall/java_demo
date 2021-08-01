package cn.geekhall.controller;

import cn.geekhall.bean.User;
import cn.geekhall.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * UserController.java
 *
 * @author yiny
 */
@Controller
public class UserController {

    // http://localhost:8080/json1
    // User(id=1, name=极客堂, age=20)
    @RequestMapping(value="/json1", produces = "application/json;charset=utf-8")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json1(){

        // 1。 创建一个对象
        User user  = new User(1, "极客堂", 20);

        return user.toString();
    }

    // http://localhost:8080/json2
    // {"id":1,"name":"极客堂","age":18}
    @RequestMapping(value="/json2", produces = "application/json;charset=utf-8")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json2() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        // 1。 创建一个对象
//        User user  = new User(1, "极客堂", 18);
//
//        return mapper.writeValueAsString(user);
        return JsonUtils.getJson(new User(1, "极客堂", 18));
    }


    // http://localhost:8080/json3
    // [{"id":1,"name":"极客堂1","age":18},{"id":2,"name":"极客堂2","age":18},{"id":3,"name":"极客堂3","age":18},{"id":4,"name":"极客堂4","age":18}]
    @RequestMapping(value="/json3")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json3() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1  = new User(1, "极客堂1", 18);
        User user2  = new User(2, "极客堂2", 18);
        User user3  = new User(3, "极客堂3", 18);
        User user4  = new User(4, "极客堂4", 18);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JsonUtils.getJson(userList);
    }

    @RequestMapping(value="/json4")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json4() throws JsonProcessingException {
        return JsonUtils.getJson(new Date());
    }

    @RequestMapping(value="/json5")
    @ResponseBody  // 不走视图解析器，直接返回一个字符串
    public String json5() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }
}
