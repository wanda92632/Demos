package com.wanda.demos.arithmeticCache;

/**
 * F(i)=max(F(i-1)+array[i],array[i])
 * 动态规划 求最大子序列
 */
public class LargestSum {
    public static int findlargestSum(int []array){
        int temp=array[0];//记录当前所有子数组的和的最大值
        int max=array[0];//包含array[i]的连续数组的最大值
        for(int i=1;i<array.length;i++){
            max=Math.max(max+array[i],array[i]);
            temp=Math.max(max,temp);
        }
        return temp;
    }
    public static void main(String[] args) {

        int[] array ={2,3,4,-4,3,5,-7,4,3-2};
        int final_value=findlargestSum(array);
        System.out.println(final_value);
    }
}
