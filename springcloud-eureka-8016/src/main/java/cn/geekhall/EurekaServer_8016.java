package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer_8015.java
 *
 * @author yiny
 */
@SpringBootApplication
@EnableEurekaServer         // 服务端的启动类，可以接受别人注册进来
public class EurekaServer_8016 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_8016.class, args);
    }
}


