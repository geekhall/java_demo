package cn.geekhall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * User.java
 *
 * @author yiny
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User implements Serializable {
    private String name;
    private int age;
}
