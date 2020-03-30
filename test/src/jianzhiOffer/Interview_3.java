package jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 寻找数组中不重复的两个数
 *
 * @author ZhiFei
 */
public class Interview_3 {
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,4,4,5,5,6,6,77,8};
        int len = arr.length;
        int sum=0,k=1,x=0,y=0;
        //第k为为 0 或 1
        List<Integer> arr0 = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        for (int value : arr) {
            sum = sum ^ value;
        }
        System.out.println(sum);
        while ((sum & 1) != 1) {
            sum>>=1;
            k++;
        }
        int j=1<<k-1;
        for(int i=0;i<len;i++){
            if((arr[i]&j)==0){
                arr0.add(arr[i]);
            }else {
                arr1.add(arr[i]);
            }
        }
        for(int i : arr0){
            x^=i;
        }
        for(int i : arr1){
            y^=i;
        }
        System.out.println(x+":"+y);
    }
}
