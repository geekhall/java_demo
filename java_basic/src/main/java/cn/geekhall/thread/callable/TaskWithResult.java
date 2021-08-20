package cn.geekhall.thread.callable;

import java.util.concurrent.Callable;

/**
 * TaskWithResult.java
 *
 * @author yiny
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id){
        this.id = id;
    }

    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }
}

