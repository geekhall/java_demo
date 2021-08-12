package cn.geekhall.boot.cedar;

import cn.geekhall.boot.configuration.EnableAdp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

/**
 * CedarMain.java
 *
 * @author yiny
 */
@SpringBootApplication(scanBasePackages = {"cn.geekhall"})
@EnableAdp
public class CedarMain {
    private static final String LTTS_VMID = "ltts.vmid";
    private static final String LTTS_LOG_HOME = "ltts.log.home";
    private static final String LTTS_PATH = "log4j.configurationFile";

    public static void main(String[] args) {
        try {
            checkLogParam();
            SpringApplication application = new SpringApplication(new Class[]{CedarMain.class});
            application.run(args);
        } catch (Exception ex) {
            throw new RuntimeException("Service Startup Failure", ex);
        }
    }


    public static void checkLogParam(){
        Assert.notNull(System.getProperty("ltts.vmid"), "ltts.vmid must not be null");
//        Assert.notNull(System.getProperty("ltts.log.home"),"ltts.log.home must not be null");
    }
}
