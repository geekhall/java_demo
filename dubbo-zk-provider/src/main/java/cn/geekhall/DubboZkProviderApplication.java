package cn.geekhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

@SpringBootApplication
public class DubboZkProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboZkProviderApplication.class, args);
        Main.main(args);
    }
}
