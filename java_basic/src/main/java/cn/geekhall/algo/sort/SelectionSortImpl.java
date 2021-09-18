package cn.geekhall.algo.sort;

/**
 * SelectionSortImpl.java
 * 选择排序
 * 1. 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 2. 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3. 重复第二步，直到所有元素均排序完毕。
 *
 * @author yiny
 */
public class SelectionSortImpl extends ArraySortBase implements IArraySort{

    public void sort(int[] arr) {
        // 总共需要N-1轮比较
        for(int i = 0; i <arr.length - 1; i++){
            int min = i;    // 最小值位置

            // 每轮需要比较的次数（N-i）
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j]< arr[min]){
                    min = j;    // 记录最小值索引
                }
            }

            // 每轮将找到的最小值和i位置所在的值进行交换
            if (i != min){
                swap(arr, i, min);
            }
        }
    }
}
