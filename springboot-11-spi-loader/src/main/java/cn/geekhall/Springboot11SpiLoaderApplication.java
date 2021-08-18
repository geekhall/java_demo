package cn.geekhall;

import cn.geekhall.config.IMyConfig;
import cn.geekhall.config.MyConfig;
import cn.geekhall.config.MyConfigB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.rmi.rmic.Main;

@SpringBootApplication
public class Springboot11SpiLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11SpiLoaderApplication.class, args);
        System.out.println("test");
//        IMyConfig myConfig = new MyConfig();
//        IMyConfig myConfigb = new MyConfigB();
//        myConfig.systemInit();
    }

}
