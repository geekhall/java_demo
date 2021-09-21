package cn.geekhall.algo.sort;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Arrays;

/**
 * InsertSortImpl.java
 * 插入排序：
 * 插入排序的代码实现虽然没有冒泡排序和选择排序那么简单粗暴，但它的原理应该是最容易理解的了，
 * 插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * @author yiny
 */
public class InsertionSortImpl extends ArraySortBase implements IArraySort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {   // 从第2个元素开始遍历，默认第一个元素为有序的。
            int key = arr[i];   // 记录要插入的数据

            // 从已经排序的序列的最右边开始比较，找到比其小的数
            int j = i;
            while (j > 0 && key < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i)
                arr[j] = key;
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
//        int[] sample_array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        int[] sample_array = {1, 6, 2, 4, 3, 7, 5, 8, 9};
        System.out.println(Arrays.toString(sample_array));
        injector.getInstance(InsertionSortImpl.class).sort(sample_array);
        System.out.println(Arrays.toString(sample_array));
    }

}
