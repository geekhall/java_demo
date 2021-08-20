package cn.geekhall.thread;

/**
 * ThreadTest.java
 *
 * @author yiny
 */
public class ThreadTest {
    static ThreadLocal<User> threadLocalUser = new ThreadLocal<User>();
    private static ThreadTest instance = new ThreadTest();

    public static ThreadTest get(){
        return instance;
    }
    void processUser(User user){
        // 通过设置一个User实例关联到ThreadLocal中，在移除之前，所有方法都可以随时获取到该User实例：
        try{
            threadLocalUser.set(user);
            step1();
            step2();
        } finally {
            threadLocalUser.remove();
        }

    }

    private void step1() {
        System.out.println("========= step1 ========= ");
        User user = threadLocalUser.get();
        log();
        System.out.println(user);
        System.out.println("========= step2 ========= ");
    }

    void log() {
        System.out.println("========= log ========= ");
        System.out.println(Thread.currentThread().getName());
        User u = threadLocalUser.get();
        System.out.println(u);
        System.out.println("========= log ========= ");
    }

    private void step2() {
        System.out.println("========= step2 ========= ");
        User u = threadLocalUser.get();
        System.out.println(u);
        System.out.println("========= step2 ========= ");
    }
    public static void main(String[] args) {
        ThreadTest.get().processUser(new User("200", "GH"));
    }
}
