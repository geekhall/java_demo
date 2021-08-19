package cn.geekhall.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * LocalBean.java
 *
 * @author yiny
 */
@Component
@Scope("singleton")
public class LocalBean {

    @Value("100")
    private String id;

    @Value("GeekHall")
    private String name;

    @Override
    public String toString() {
        return "LocalBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalBean() {
    }

    public LocalBean(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
