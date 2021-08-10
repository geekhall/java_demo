package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * DeptProvider_8011.java
 * 启动类
 * @author yiny
 */
@SpringBootApplication
@EnableEurekaClient             // 服务启动时自动注册到Eureka中。
@EnableDiscoveryClient          // 服务发现
public class DeptProvider_8011 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8011.class, args);
    }
}
