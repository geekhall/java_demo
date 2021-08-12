package cn.geekhall.di;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * MyBean.java
 *
 * @author yiny
 */
public class MyBean {
    private String id;
    private String name;
    @Inject
    public void test(){
        System.out.println("=================================");
        System.out.println("执行了 MyBean ===> test()方法，");
        System.out.println("=================================");
    }

}
