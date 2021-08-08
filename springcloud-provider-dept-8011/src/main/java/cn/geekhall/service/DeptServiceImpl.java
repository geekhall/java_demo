package cn.geekhall.service;

import cn.geekhall.bean.Dept;
import cn.geekhall.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DeptServiceImpl.java
 *
 * @author yiny
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept getDeptbyId(Long id) {
        return deptDao.getDeptById(id);
    }

    public List<Dept> getDepts() {
        return deptDao.getDepts();
    }
}
