package cn.geekhall.algo.sort;

/**
 * ShellSortImpl.java
 *
 * @author yiny
 */
public class ShellSortImpl extends ArraySortBase implements IArraySort{
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }
}
