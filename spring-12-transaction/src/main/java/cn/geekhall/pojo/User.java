package cn.geekhall.pojo;

/**
 * User.java
 *
 * @author yiny
 */
public class User {
    private String id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
