package cn.geekhall.bean;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Dept.java
 *
 * @author yiny
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)    // 链式写法
public class Dept implements Serializable {
    private Long deptNo;    //主键
    private String dname;
    // 这个数据存在哪个数据库的字段，微服务每个服务对应一个数据库，同一个信息可能存在不同的数据库。
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
