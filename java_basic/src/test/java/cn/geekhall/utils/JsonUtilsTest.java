package cn.geekhall.utils;

import cn.geekhall.bean.User;
import cn.geekhall.bean.UserUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * JsonUtilsTest.java
 *
 * @author yiny
 */
public class JsonUtilsTest {
    @Test
    public void test(){
        System.out.println("=================== 【fastjson】Java对象转 JSON 字符串 ======================");
        String str1 = JSON.toJSONString(UserUtils.getUserList());
        System.out.println("JSON.toJSONString(list) ====> " + str1);
        System.out.println("");
        User user = new User(10,"月白", 28);
        String str2 = JSON.toJSONString(user);
        System.out.println("JSON.toJSONString(user) ====> " + str2);


        System.out.println("");
        System.out.println("=================== 【fastjson】JSON 字符串  转  Java对象 ======================");
        User new_user2 = JSON.parseObject(str2, User.class);
        System.out.println("JSON.parseObject(str2, User.class)  ====>  " + new_user2 );


        System.out.println("");
        System.out.println("=================== 【fastjson】Java对象 转 JSON对象  ======================");
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        System.out.println("(JSONObject) JSON.toJSON(user)  ====> " + jsonObject);

        System.out.println("");
        System.out.println("=================== 【fastjson】JSON对象 转 Java对象 ======================");
        User user3 = JSON.toJavaObject(jsonObject, User.class);
        System.out.println("JSON.toJavaObject(jsonObject, User.class) ====> " + user3 );

        System.out.println("");
        System.out.println("=================== 【jackson】java对象转 JSON字符串 ======================");
        String str11 = JsonUtils.getJson(UserUtils.getUserList());
        System.out.println("JsonUtils.getJson(UserUtils.getUserList()) ====> " + str11);
        User user11 = new User(10,"月白", 28);
        String str12 = JsonUtils.getJson(user11);
        System.out.println("JsonUtils.getJson(user11) ====> " + str12);


    }
}
