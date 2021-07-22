package cn.geekhall.service;

import cn.geekhall.dao.UserDaoMysqlImpl;
import cn.geekhall.dao.UserDaoOracleImpl;

/**
 * UserServiceImplTest.java
 *
 * @author yiny
 */
public class UserServiceImplTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        // 通过setter方法将Dao类注入到UserService，使得用户需求发生变化（数据库变更）时servidce层代码无需变动。
        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
