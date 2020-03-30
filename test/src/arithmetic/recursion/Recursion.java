package arithmetic.recursion;

import java.util.Arrays;

/**
 * 递归实现寻找最大值
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/12 16:21
 */
public class Recursion {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1,10};
        System.out.println(getMax(arr,0,arr.length-1));
    }

    public static int getMax(int[] arr,int L,int R){
        if(L==R){
            return arr[L];
        }

        int mid = (L+R)/2;
        int maxLeft=getMax(arr,L,mid);
        int maxRight=getMax(arr,mid+1,R);
        return Math.max(maxLeft,maxRight);
    }
}
