package cn.geekhall.algo.sort;

/**
 * ArraySort.java
 *
 * @author yiny
 */
abstract class ArraySortBase{

    /**
     * swap array element in position i and j;
     * @param arr
     * @param i
     * @param j
     */
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
