package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * DeptConsumer_80.java
 *
 * @author yiny
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients({"cn.geekhall"})
public class DeptConsumer_8012 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8012.class, args);
    }
}
