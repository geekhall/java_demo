package cn.geekhall.thread.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * CallableTest.java
 *
 * @author yiny
 */
public class CallableTest {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();
        // Future 相当于是用来存放Executor执行结果的一种容器。
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        TaskWithResult taskWithResult = new TaskWithResult(100);
        System.out.println(taskWithResult.call());

        for (int i = 0; i< 10; i++){
            results.add(executorService.submit(new TaskWithResult(i)));
        }

        for (Future<String> result : results) {
            if (result.isDone()) {
                System.out.println(result.get());
            } else {
                System.out.println("Future result is not yet complete.");
            }
        }
        executorService.shutdown();

    }
}
