package cn.geekhall.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * TestJdbc.java
 *
 * @author yiny
 */
public class TestJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3316/mybatis?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8";
        String username = "mybatis";
        String password = "yy123456";

        // 1. 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 连接数据库，代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3. 编写SQL
        String sql = "insert into user(id, name, pwd) values (?, ?, ?)";

        // 4. 预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,100);        //给第一个占位符？的值赋值为100；
        preparedStatement.setString(2, "JDBC"); //给第二个占位符？的值赋值为JDBC；
        preparedStatement.setString(3,"asdf");  //给第三个占位符？的值赋值为asdf；

        // 5. 执行SQL
        int i = preparedStatement.executeUpdate();

        if (i > 0){
            System.out.println("插入成功@");
        }

        // 6. 关闭连接，释放资源
        preparedStatement.close();
    }
}
