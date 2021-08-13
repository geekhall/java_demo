package cn.geekhall.boot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * AdpApplicationListener.java
 *
 * @author yiny
 */
@Component
public class AdpApplicationListener implements ApplicationListener<ApplicationEvent>, Ordered {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("====================");
        System.out.println("Listener started .... ");
        System.out.println(event);
        System.out.println(event.getSource());
        System.out.println("====================");
    }

    public int getOrder() {
        return 0;
    }
}
