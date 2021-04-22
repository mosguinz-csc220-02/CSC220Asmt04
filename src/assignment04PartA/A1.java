package assignment04PartA;

import java.util.Arrays;

public class A1 {

    public static int[] numbers = {9, 1, 2, 4, 3, 5, 6, 2, 9, 8, 5, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void selectionSort(int[] arr) {
        for (int i = 0, stop = arr.length - 1; i < stop; i++) {
            int newSmallestIdx = getSmallestIndex(arr, i, stop);
            int temp = arr[i];
            arr[i] = arr[newSmallestIdx];
            arr[newSmallestIdx] = temp;
        }
    }

    private static int getSmallestIndex(int[] arr, int start, int stop) {
        int min = arr[start];
        int minIdx = start;

        for (int i = start + 1; i <= stop; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
}
