package cn.geekhall.algo.sort;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Arrays;

/**
 * SortTest.java
 *
 * @author yiny
 */
public class SortTest {

    public static void test(Class<?> clazz, int[] arr){
        Injector injector = Guice.createInjector();
        System.out.println(Arrays.toString(arr));
        ((IArraySort)injector.getInstance(clazz)).sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
