package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer_8017.java
 *
 * @author yiny
 */
@SpringBootApplication
@EnableEurekaServer         // 服务端的启动类，可以接受别人注册进来
public class EurekaServer_8017 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_8017.class, args);
    }
}
