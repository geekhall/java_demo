package cn.geekhall.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * UserUtils.java
 *
 * @author yiny
 */
public class UserUtils {
    public static List<User> getUserList(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "极客堂1", 21));
        userList.add(new User(2, "极客堂2", 18));
        userList.add(new User(3, "极客堂3", 19));
        userList.add(new User(4, "极客堂4", 20));
        userList.add(new User(5, "极客堂5", 22));
        return userList;
    }
}
