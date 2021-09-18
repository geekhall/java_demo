package cn.geekhall.algo.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * QuickSort.java
 * 快速排序：
 * 算法思想：选择序列中一个元素作为基准元素base，维护两个指针front和back分别指向序列的首尾，
 * 首先用front指向的元素和base进行比较，如果大于base，则与back指向的元素进行交换，否则指针右移；
 * 然后比较back指向的元素是否小于base，返回为true则与front指向的元素进行交换，否则指针左移。
 * 前后交替这样就能保证较小数都放在base的左边，较大数在base的右边，然后递归调用对各部分继续排序，直到最后排好序。
 *
 * @author yiny
 */
public class QuickSortImpl1 extends ArraySortBase implements IArraySort {

    public void sort(int[] sourceArray) {
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {

        if (left > right)
            return;

        int i = left;
        int j = right;
        int pivot = arr[left];  // 取第一个元素作为基准

        while (i!=j){
            while (i<j && arr[j] >= pivot)  // 这里需要注意：一定要右侧先开始移动！
                j--;
            while (i<j && arr[i] <= pivot)
                i++;
            if (i<j)
                swap(arr, i, j);
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, left, i - 1);
        quickSort(arr, i+1, right);
    }

}
