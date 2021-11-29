package com.wanda.demos.arithmetic.sort;

/**
 * 插入排序 时间复杂度 O(n^2) 额外空间复杂度 O(1)
 * 思想：遍历 n(数组长度)-1 次，排序时将该数插到对应的位置，使前 i 个数字有序
 * 时间和实际的数组的情况相关
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/11 12:49
 */
public class InsertionSort implements ArrSort {

    /**
     * 插入排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
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
