package cn.geekhall.dao;

import cn.geekhall.bean.Department;
import cn.geekhall.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * EmployeeDao.java
 *
 * @author yiny
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();

        employees.put(000001, new Employee(000001, "MW", "mw@geekhall.cn", 1, new Department(101, "开发部")));
        employees.put(000001, new Employee(000002, "AA", "aa@geekhall.cn", 0, new Department(101, "开发部")));
        employees.put(000001, new Employee(000003, "BB", "bb@geekhall.cn", 1, new Department(102, "运维部")));
        employees.put(000001, new Employee(000004, "CC", "cc@geekhall.cn", 1, new Department(103, "安全部")));
        employees.put(000001, new Employee(000005, "DD", "dd@geekhall.cn", 0, new Department(104, "财务部")));
        employees.put(000001, new Employee(000006, "EE", "ee@geekhall.cn", 0, new Department(105, "市场部")));
    }

    // 主键自增
    private static Integer initId = 7;

    /**
     * 增加一个员工
     * @param employee
     */
    public void save (Employee employee){
        if (employee.getId() == null){
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(), employee);
    }

    /**
     * 查询所有员工信息
     * @return
     */
    public Collection<Employee> getAll(){
        return employees.values();
    }

    /**
     * 通过id查询员工
     * @param id 员工ID
     * @return
     */
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    /**
     * 通过id删除员工
     * @param id 员工ID
     */
    public void delete(Integer id){
        employees.remove(id);
    }


}
