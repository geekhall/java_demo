package cn.geekhall.basic;

import java.math.BigDecimal;

/**
 * StringTest.java
 *
 * @author yiny
 */
public class StringTest {
//    public static void main(String[] args) {
//        String str = "a.b.c.d";
//
//        String[] sss = str.split("\\.", -1);
//        System.out.println(sss);
//        for (String s : sss) {
//            System.out.println(s);
//        }
//    }

//    public static void main(String[] args) {
//        String str = new String("0101234588");
//        System.out.println(str.hashCode());
//
////        char [] value = new String("0101234588").toCharArray();
//        LocalString str1 = new LocalString("0101234589".toCharArray(), 0);
//        System.out.println(str1.hashCode());
//
//    }
    public static void main(String[] args) {
        BigDecimal a =new BigDecimal(200);
        BigDecimal b =new BigDecimal(3);
        BigDecimal c = a.divide(a,2, BigDecimal.ROUND_CEILING) ;
        System.out.println(c);

    }
}
