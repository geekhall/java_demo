package cn.geekhall.jvm;

import java.util.ArrayList;

/**
 * JProfileTest.java
 * VM parameter: -Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/Users/yiny/Sites/dumps
 *
 * @author yiny
 */
public class JProfileTest {
    byte[] array = new byte[1024 * 1024];

    public static void main(String[] args) {
        ArrayList<JProfileTest> jtest = new ArrayList<JProfileTest>();
        int icount = 0;

        try {
            while (true) {
                jtest.add(new JProfileTest());
                icount += 1;
            }
        } catch (Error e){
            System.out.println(icount);
            e.printStackTrace();
        }
    }
}
