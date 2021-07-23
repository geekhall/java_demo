package cn.geekhall.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PersonAutowiredTest.java
 *
 * @author yiny
 */
public class PersonAutowiredTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autobeans.xml");

        Person person = (Person) context.getBean("person");
        person.getCat().shout();
        person.getDog().shout();
        System.out.println(person);
    }
}
