package com.wanda.demos.arithmetic.sort;

/**
 * 选择排序 时间复杂度 O(n^2) 额外空间复杂度 O(1)
 * 思想：遍历 n(数组长度)-1 次，每次遍历过程中找出最大(小)的数的下标，然后与对应下标的数进行替换
 *
 * 基本上弃用
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/11 11:48
 */
public class SelectionSort implements ArrSort {

    /**
     * 选择排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    // 交换位置
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
