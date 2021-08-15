package cn.geekhall.jvm;

import java.util.Random;

/**
 * OOMTest.java
 *
 * @author yiny
 */
public class OOMTest {
    public static void main(String[] args) {
        String str = "geekhall.cn";
        while (true){
            str += str + new Random().nextInt(88888888) + new Random().nextInt(88888888);
        }

    }
}
