package sort.util;

import java.util.Random;

public class SortHelper {

    public static int[] generateRandomArray(int size, int rangeL, int rangeR) {
        if (rangeL > rangeR) {
            throw new IllegalArgumentException("范围区间参数非法");
        }
        int[] result = new int[size];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(rangeR - rangeL + 1) + rangeL;
        }
        return result;
    }

    public static void printArray(int[] array) {
        if (array != null) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(array[i]);
            }
            System.out.print("]");
            System.out.print("\n");
        }
    }

}
