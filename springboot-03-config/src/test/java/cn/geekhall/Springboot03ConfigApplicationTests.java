package cn.geekhall;

import cn.geekhall.bean.Cat;
import cn.geekhall.bean.Dog;
import cn.geekhall.bean.Person;
import cn.geekhall.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ConfigApplicationTests {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Autowired
    private Student student;

    @Autowired
    private Cat cat;


    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
        System.out.println(student);
        System.out.println(cat);
    }

}
