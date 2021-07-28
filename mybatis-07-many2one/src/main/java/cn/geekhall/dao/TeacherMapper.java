package cn.geekhall.dao;

import cn.geekhall.bean.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TeacherMapper.java
 *
 * @author yiny
 */
public interface TeacherMapper {

    // 获取老师
    List<Teacher> getTeacher();

    // 获取指定老师下的所有学生及老师的信息(按照结果嵌套处理)
    Teacher getTeacher2(@Param("tid") int id);

    // 获取指定老师下的所有学生及老师的信息(按照查询嵌套处理)
    Teacher getTeacher3(@Param("tid") int id);
}
