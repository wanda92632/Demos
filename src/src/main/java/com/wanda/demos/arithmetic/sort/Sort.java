package arithmetic.sort;

import java.util.Arrays;

/**
 * 调用排序方法，显示排序时间
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/11 12:24
 */
public class Sort {

    /**
     * 排序性能查看
     *
     * @param arrSort 排序方法
     * @param length  排序数组长度
     */
    public void sort(ArrSort arrSort, int length) {
        int[] arr = RandomArray.randomArray(length);
        System.out.println("原数组：" + Arrays.toString(arr));
        long startTime = System.nanoTime();
        arrSort.sort(arr);
        long endTime = System.nanoTime();
        System.out.println("排序后：" + Arrays.toString(arr));
        if (check(arr)) {
            System.out.println("用时：" + (endTime - startTime) + " 纳秒");
        } else {
            System.out.println("排序失败");
        }
    }

    public boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
