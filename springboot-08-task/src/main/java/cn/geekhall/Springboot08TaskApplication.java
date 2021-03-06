package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync   // 开启异步注解支持
@SpringBootApplication
public class Springboot08TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08TaskApplication.class, args);
    }

}
