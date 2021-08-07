package cn.geekhall.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * AsyncService.java
 *
 * @author yiny
 */
@Service
public class AsyncService {

    // 告诉Spring这个一个异步方法
    @Async
    public void hello(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正在处理。。。。");

    }
}
