package com.wanda.demos.jianzhiOffer;

/**
 * @author ZhiFei
 */
public class Interview_11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Interview_11 test = new Interview_11();
        int index = test.find(arr,1,0,arr.length-1);
        System.out.println(index);
    }

    /**
     *
     * @param arr //数组
     * @param i 要找的数
     * @param start 数组起始下标
     * @param end 数组结束下标
     * @return
     */
    public Integer find(int[] arr,int i,int start,int end){
        int center = end-start/2+start;
        if (i==arr[center])
            return center;
        if (i>arr[center])
            return find(arr,i,center+1,end);
        else
            return find(arr,i,start,center-1);
    }
}
