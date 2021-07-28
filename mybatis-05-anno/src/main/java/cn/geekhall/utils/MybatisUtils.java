package cn.geekhall.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MybatisUtils.java
 *
 * @author yiny
 */
//sqlSessionFactory ----> sqlSession
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {

        try {
            // 获取SqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 从SqlSessionFactory中获取SqlSession的实例。
     * SqlSession 包含了面向数据库执行SQL命令所需的所有方法。
     * @return SqlSession
     */
    public static SqlSession getSqlSession(){
        // openSession 的参数设置为true时表示所有的操作会自动提交：（autoCommit）
        return sqlSessionFactory.openSession(true);
    }
}
