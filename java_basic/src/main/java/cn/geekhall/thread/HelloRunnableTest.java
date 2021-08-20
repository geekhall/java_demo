package cn.geekhall.thread;

import java.util.ArrayList;

/**
 * HelloRunnableTest.java
 *
 * @author yiny
 */
public class HelloRunnableTest {
    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloRunnable();
        helloRunnable.run();
        HelloThread helloThread = new HelloThread();
        helloThread.run();

        ArrayList<String> messages = new ArrayList<String>();
        messages.add("Hello");
        messages.add("Geek");
        messages.add("Hall");

        ThreadContext.getInstance().setMessages(messages);
        SleepThread sleepThread = new SleepThread();
        sleepThread.run();

    }
}
