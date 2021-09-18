package cn.geekhall.algo.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * QuickSort.java
 *
 * @author yiny
 */
public class QuickSortImpl extends ArraySortBase implements IArraySort {

    public void sort(int[] sourceArray) {
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        System.out.println(Arrays.toString(arr));
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    /**
     * 查找分区位置元素的索引值
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int partition(int[] arr, int left, int right) {
        int pivot = left;                       // 取初始基准值pivot为数组左边起始元素
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {  // 自基准值后第二个元素开始向右遍历
            if (arr[i] < arr[pivot]) {          // 若小于基准值，则交换当前位置的元素和
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

}
