package cn.geekhall;

import java.util.ServiceLoader;

/**
 * PayServiceTest.java
 *
 * @author yiny
 */
public class PayServiceTest {
    public static void main(String[] args) {
        ServiceLoader<PayService> services = ServiceLoader.load(PayService.class);
        for (PayService service : services) {
            service.pay();
        }
    }
}
