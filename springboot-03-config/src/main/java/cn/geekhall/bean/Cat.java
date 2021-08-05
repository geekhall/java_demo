package cn.geekhall.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Cat.java
 *
 * @author yiny
 */
@Component
@ConfigurationProperties(prefix = "cat")
public class Cat {
    private String firstName;
    private Integer age;

    public Cat(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
