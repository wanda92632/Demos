package arithmetic.sort;

public class Main {

    public static void main(String[] args) {
        Sort sort = new Sort();
        // 冒泡排序
        //sort.sort(new BubbleSort(),10);
        // 选择排序
        //sort.sort(new SelectionSort(),10);
        // 插入排序
        //sort.sort(new InsertionSort(),10);
        // 归并排序
        //sort.sort(new MergeSort(),10);
        // 快速排序
        sort.sort(new QuickSort(),10);
    }

}
