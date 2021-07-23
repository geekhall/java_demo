package cn.geekhall.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * Person.java
 *
 * @author yiny
 */
public class Person {


    private String name;

//    @Autowired
//    @Qualifier(value = "cat222")
//    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog111")
//    private Dog dog;

    @Resource(name = "cat111")
    private Cat cat;

    @Resource
    private Dog dog;

    public Person() {
    }

    // 加上@Nullable之后，即使name为null也不会报错。
    public Person(@Nullable String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
