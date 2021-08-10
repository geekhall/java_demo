package cn.geekhall;

import cn.geekhall.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.rmi.rmic.Main;

@SpringBootApplication
public class Springboot11SpiLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11SpiLoaderApplication.class, args);
        System.out.println("test");
        MyConfig myConfig = new MyConfig();
        myConfig.systemInit();
    }

}
