package cn.geekhall.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * User.java
 *
 * @author yiny
 */

// @Component 等价于 <bean id="user" class="cn.geekhall.pojo.User"/>
@Component
@Scope("singleton")
public class User {
    //@Value 用于属性的注入，相当于 <property name="name" value="极客堂"/>，也可以标记在setter方法上。
    @Value("极客堂")
    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    @Value("18")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
