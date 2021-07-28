package cn.geekhall.dao;

import cn.geekhall.bean.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * StudentMapper.java
 *
 * @author yiny
 */
public interface StudentMapper {

    // select s.id, s.name, t.name from student s, teacher t where t.id = s.id
    List<Student> getStudents();

    List<Student> getStudents2();
}
