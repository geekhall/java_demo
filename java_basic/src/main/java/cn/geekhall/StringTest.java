package cn.geekhall;

/**
 * StringTest.java
 *
 * @author yiny
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "a.b.c.d";

        String[] sss = str.split("\\.");
        System.out.println(sss);
        for (String s : sss) {
            System.out.println(s);
        }
    }
}
