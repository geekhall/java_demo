package cn.geekhall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User.java
 *
 * @author yiny
 */
@Data // 生成无参构造器，Getter , Setter, equals, hashcode, toString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
