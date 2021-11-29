package com.wanda.demos.jianzhiOffer;

/**
 * 在二位数组中找到相等的数
 *
 * @author ZhiFei
 */
public class Interview_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println(find(arr, 8) ? "找到" : "不存在");
    }

    public static boolean find(int[][] arr, int n) {
        int iMax = arr.length;
        int jMAx = arr[0].length;
        int i = 0, j = jMAx - 1;
        while (i < iMax && j >= 0) {
            if (arr[i][j] > n) {
                --j;
            } else if (arr[i][j]< n) {
                ++i;
            } else {
                System.out.println(i + ":" + j);
                return true;
            }
        }
        return false;
    }
}
