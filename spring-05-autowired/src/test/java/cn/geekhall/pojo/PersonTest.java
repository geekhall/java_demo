package cn.geekhall.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PersonTest.java
 *
 * @author yiny
 */
public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");
        person.getCat().shout();
        person.getDog().shout();
        System.out.println(person);


        Person person2 = (Person) context.getBean("person2");
        person2.getCat().shout();
        person2.getDog().shout();
        System.out.println(person2);

        Person person3 = (Person) context.getBean("person3");
        person3.getCat().shout();
        person3.getDog().shout();
        System.out.println(person3);
    }
}
