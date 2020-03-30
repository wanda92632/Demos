package arithmetic.sort;

/**
 * 归并排序 时间复杂度(N*logN)，额外空间复杂度O(N)
 * 分开排序，运用到了递归的思想
 *
 * @Author 知非
 * @Email wanda92632@163.com
 * @Date 2019/12/12 16:44
 */
public class MergeSort implements ArrSort {
    /**
     * 归并排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        sortProcess(arr, 0, arr.length - 1);
    }

    public void sortProcess(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1); //L和R 中点的位置（L+R）/ 2
        sortProcess(arr, L, mid);
        sortProcess(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    /**
     * 进行排序
     *
     * @param arr
     * @param L
     * @param mid
     * @param R
     */
    public void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1]; // 辅助数组
        int i = 0;
        int p1 = L; // 左侧数组起始下标
        int p2 = mid + 1; // 右侧数组起始下标
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 两个必有且只有一个越界
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}
