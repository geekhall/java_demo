package cn.geekhall.thread;

/**
 * Normal.java
 *
 * @author yiny
 */
public class Normal {
    public static void main(String[] args) {
        log("start main ... ");
        new Thread(new Runnable() {
            public void run() {
                log("run task ... ");
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                log("run task2 .... ");
            }
        }).start();
        log("end main ... ");
    }

    static void log(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }

}
