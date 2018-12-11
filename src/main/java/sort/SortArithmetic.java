package sort;

import sort.util.SortHelper;

public class SortArithmetic {

    /**
     * 选择排序
     *
     * @param value
     * @return
     */
    public static int[] selectionSort(int[] value) {
        for (int i = 0; i < value.length; i++) {
            int minIndex = i;
            for (int j = i; j < value.length; j++) {
                if (value[minIndex] > value[j]) {
                    minIndex = j;
                }
            }
            int temp = value[minIndex];
            value[minIndex] = value[i];
            value[i] = temp;
        }
        return value;
    }

    /**
     * 插入排序
     *
     * @param value
     * @return
     */
    public static int[] insertionSort(int[] value) {
        for (int i = 1; i < value.length; i++) {
            int swapIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (value[swapIndex] < value[j]) {
                    int temp = value[swapIndex];
                    value[swapIndex] = value[j];
                    value[j] = temp;
                    swapIndex = j;
                } else {
                    break;
                }
            }
        }
        return value;
    }

    public static void main(String... args) {
        // 选择排序
        SortHelper.printArray(SortArithmetic.selectionSort(SortHelper.generateRandomArray(10, 0, 100)));
        // 插入排序
        SortHelper.printArray(SortArithmetic.insertionSort(SortHelper.generateRandomArray(10, 0, 100)));
    }

}
