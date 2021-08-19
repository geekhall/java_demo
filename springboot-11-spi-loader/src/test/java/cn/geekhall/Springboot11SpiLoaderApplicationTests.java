package cn.geekhall;

import cn.geekhall.bean.LocalBean;
import cn.geekhall.config.IMyConfig;
import cn.geekhall.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Springboot11SpiLoaderApplicationTests {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        LocalBean localBean = context.getBean("LocalBean", LocalBean.class);
//        LocalBean localBean = context.getBean("localbean", LocalBean.class);
        // 注意这里只能写成"localBean" ，上面的两种写法都会报NoSuchBeanDefinitionException
        LocalBean localBean = context.getBean("localBean", LocalBean.class);
        IMyConfig myConfig = context.getBean("myConfig", IMyConfig.class);
        System.out.println(localBean);
        System.out.println(myConfig);
    }
}
