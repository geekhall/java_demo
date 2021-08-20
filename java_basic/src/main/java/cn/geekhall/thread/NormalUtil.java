package cn.geekhall.thread;

/**
 * NormalUtil.java
 *
 * @author yiny
 */
public class NormalUtil {
    public void process(User user) {
        checkPermission();
        doWork();
        saveStatus();
        sendResponse();
    }

    void doWork(User user) {
        queryStatus(user);
        checkStatus();
        setNewStatus(user);
        log();
    }
    private void log(){
        System.out.println(Thread.currentThread().getName());
    }
    private void setNewStatus(User user){
        System.out.println("setNewStatus called ... ");
    }
    private void checkStatus(){
        System.out.println("checkStatus called ... ");
    }

    private void queryStatus(User user){
        System.out.println("queryStatus called ... ");
    }

    private void sendResponse(){
        System.out.println("sendResopnse called ... ");
    }
    private void saveStatus() {
        System.out.println("saveStatus called ... ");
    }

    private void doWork() {
        System.out.println("duWork called ... ");
    }

    private void checkPermission(){
        System.out.println("checkPermission called ... ");
    }


}
