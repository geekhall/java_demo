package cn.geekhall.dao;

import cn.geekhall.bean.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * DepartmentDao.java
 *
 * @author yiny
 */

public class DepartmentDao {
    //
    private static Map<Integer, Department> departments = null;

    //
    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101, new Department(101, "开发部"));
        departments.put(102, new Department(102, "运维部"));
        departments.put(103, new Department(103, "安全部"));
        departments.put(104, new Department(104, "财务部"));
        departments.put(105, new Department(105, "市场部"));
    }

    /**
     * 返回所有部门信息
     * @return
     */
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    /**
     * 通过部门ID得到部门信息。
     *
     * @param id  部门ID
     * @return  部门信息
     */
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
