package cn.geekhall.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User.java
 *
 * @author yiny
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("King")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
