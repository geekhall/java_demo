package cn.geekhall.algo.sort;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Arrays;

/**
 * ShellSortImpl.java
 *
 * @author yiny
 */
public class ShellSortImpl extends ArraySortBase implements IArraySort {
    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        for (int gap = len/2; gap >=1; gap /= 2){
            for (int i = gap; i<len; i++){
                int key= arr[i];
                int j = i - gap;
                while (j>0 && key < arr[j]){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }
                if (j != i-gap)
                    arr[j+gap] = key;
            }
        }
    }

    public static void main(String[] args) {
        int[] sample_array = {1, 6, 2, 4, 3, 7, 5, 8, 9};
        SortTest.test(ShellSortImpl.class, sample_array);
    }
}
