package cn.geekhall.bean;

import cn.geekhall.dao.StudentMapper;
import cn.geekhall.dao.TeacherMapper;
import cn.geekhall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * MainTest.java
 *
 * @author yiny
 */
public class MainTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        for (Teacher teacher : mapper.getTeacher()) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacher2Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }

    @Test
    public void getTeacher3Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher3(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}
