package jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhiFei
 */
public class Fibonacci_10 {
    public static void main(String[] args) {
        // 设项数为 0，1，2，3，4，5，6
        Long curTime1 = System.nanoTime();
        //第一种用递归的计算
        System.out.println(fibonacci_1(30));
        Long curTime2 = System.nanoTime();

        //第二种存储计算值的计算
        System.out.println(fibonacci_2(30));
        Long curTime3 = System.nanoTime();

        System.out.println("时间："+(curTime2-curTime1));
        System.out.println("时间："+(curTime3-curTime2));
    }

    public static long fibonacci_1(long i){
        if(i==0){
            return 0;
        }
        if(i==1){
            return 1;
        }
        return fibonacci_1(i-1)+ fibonacci_1(i-2);
    }

    private static Long fibonacci_2(long i){
        Map<Long,Long> map = new HashMap<>(16);
        map.put(0L,0L);
        map.put(1L,1L);
        long sum =0L;
        for (long j=2;j<=i;j++){
            sum = map.get(j-1)+map.get(j-2);
            map.put(j,sum);
        }
        return map.get(i);
    }
}
