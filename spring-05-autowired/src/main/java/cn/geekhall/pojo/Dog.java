package cn.geekhall.pojo;

/**
 * Dog.java
 *
 * @author yiny
 */
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void shout(){
        System.out.println("汪汪");
    }
}
