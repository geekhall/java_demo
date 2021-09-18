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

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        // Bubble sort
        int[] sample_array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        injector.getInstance(BubbleSortImpl.class).sort(sample_array);
//        System.out.println(Arrays.toString(sample_array));

        // Selection sort
        int[] sample_array1 = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        injector.getInstance(SelectionSortImpl.class).sort(sample_array1);
//        System.out.println(Arrays.toString(sample_array1));

        // Quick sort
//        int[] sample_array2 = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] sample_array2 = {6,1,2,7,9,3,4,5,10,8};
//        System.out.println(Arrays.toString(sample_array2));
        injector.getInstance(QuickSortImpl.class).sort(sample_array2);
//        System.out.println(Arrays.toString(sample_array2));

        System.out.println("===========================");
        // Quick sort1
        int[] sample_array3 = {6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(sample_array3));
        injector.getInstance(QuickSortImpl1.class).sort(sample_array3);
        System.out.println(Arrays.toString(sample_array3));


        System.out.println("===========================");
        int[] sample_array4 = {6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(sample_array4));
        injector.getInstance(InsertionSortImpl.class).sort(sample_array4);
        System.out.println(Arrays.toString(sample_array4));

    }
}
