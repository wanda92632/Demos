package arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序 时间复杂度 O(n^2) 额外空间复杂度 O(1)
 * 思想：遍历 n(数组长度)-1 次，每次遍历过程中两两比较替换
 * 基本上弃用
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/11 11:10
 */
public class BubbleSort implements ArrSort {

    /**
     * 冒泡排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    // 交换位置
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
