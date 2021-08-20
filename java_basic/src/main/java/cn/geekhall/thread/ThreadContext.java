package cn.geekhall.thread;

import java.util.ArrayList;

/**
 * ThreadContext.java
 *
 * @author yiny
 */
public class ThreadContext {

    private ArrayList<String> messages;
    private static ThreadContext instance = null;

    private ThreadContext() {
    }

    public static ThreadContext getInstance(){
        if ( instance == null){
            instance = new ThreadContext();
        }
        return instance;
    }
    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ThreadContext{" +
                "messages=" + messages +
                '}';
    }
}
