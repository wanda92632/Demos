package com.wanda.demos.arithmeticCache;

import java.util.Scanner;

/**
 * @author 知非
 * @date 2020/3/17 16:21
 */
public class 求最大子序列 {
    public static void main(String[] args) {
        // 获取输入数据
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        in.close();
        String[] strings = str.split(",");
        int[] nums = new int[strings.length];
        for (int i=0;i<strings.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        // 求值
        int currSum = 0,start = 0, end = 0,maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            start = currSum + nums[i] < nums[i] ? i : start;
            currSum = Math.max(currSum + nums[i], nums[i]);// 只要当前和为正数就赋值
            end = currSum < maxSum ? end : i;
            maxSum = Math.max(currSum, maxSum);
        }
        // 输出
        System.out.println(start+" "+end+" "+maxSum);
    }
}
