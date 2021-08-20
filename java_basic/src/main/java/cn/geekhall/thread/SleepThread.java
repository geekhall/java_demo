package cn.geekhall.thread;

import java.util.ArrayList;

/**
 * SleepThread.java
 *
 * @author yiny
 */
public class SleepThread implements Runnable {

    public void run() {
        ThreadContext context = ThreadContext.getInstance();
        ArrayList<String> messages = context.getMessages();
        for (String message : messages) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +" : "+ message);
        }
    }
}
