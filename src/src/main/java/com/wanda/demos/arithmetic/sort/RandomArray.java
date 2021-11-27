package arithmetic.sort;

import java.util.Random;

/**
 * 生成随机数组
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/11 11:39
 */
public class RandomArray {
    public static void main(String[] args) {
    }

    // 生成随机数组
    public static int[] randomArray(int length) {
        int[] arr;
        Random random = new Random();
        arr = random.ints(length, 0, 1000).toArray();
        return arr;
    }
}
