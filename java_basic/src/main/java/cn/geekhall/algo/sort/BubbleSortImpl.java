package cn.geekhall.algo.sort;

import javax.inject.Singleton;

/**
 * BubbleSortImpl.java
 * 冒泡排序：
 * 依次比较相邻的两个数，较小数放前面，较大数放后面，直到最大数放在最后， 然后重复操作，最后排序为升序。
 * 第一层循环为重复的次数，循环次数为array.length-1
 * 第二次循环为依次比较相邻的数，循环次数为array.length-1-i
 * @author yiny
 */
@Singleton
public class BubbleSortImpl extends ArraySortBase implements IArraySort {

    /**
     * BIG      ： 大元素向后冒泡
     * SMALL    ： 小元素向前冒泡
     */
    private enum SortAlgo {
        BIG, SMALL
    }

    // 冒泡排序
    public void sort(int[] arr) {
        sort(arr, SortAlgo.BIG);
    }

    private void sort(int[] arr, SortAlgo algo) {

        if (algo == null || algo == SortAlgo.BIG) {
            // 每一轮循环后，最大的一个数被交换到末尾，因此，下一轮循环就可以“刨除”最后的数，每一轮循环都比上一轮循环的结束位置靠前一位。
            for (int i = 0; i < arr.length - 1; i++){
                for (int j = 0; j<arr.length - i -1; j++){
                    if (arr[j] > arr[j+1]){
                        swap(arr, j, j+1);
                    }
                }
            }
        } else {
            // 每一轮循环后，最小的一个数被交换到前面，因此，下一轮循环就可以“刨除”前面的数，每一轮循环都比上一轮循环的开始位置靠后一位。
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        swap(arr, i, j);
                    }
                }
            }
        }

    }

}
