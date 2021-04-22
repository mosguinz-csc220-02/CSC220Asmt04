package assignment04PartA;

import java.util.Arrays;

public class A1 {

    public static int[] numbers = {9, 1, 2, 4, 3, 5, 6, 2, 9, 8, 5, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers, true);
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * Perform a selection sort on the given array of numbers
     *
     * @param arr     The array to sort.
     * @param verbose If {@code true}, prints the array each time an element has been sorted.
     */
    private static void selectionSort(int[] arr, boolean verbose) {
        for (int i = 0, stop = arr.length - 1; i < stop; i++) {
            int newSmallestIdx = getSmallestIndex(arr, i, stop);
            int temp = arr[i];
            arr[i] = arr[newSmallestIdx];
            arr[newSmallestIdx] = temp;
        }
    }

    /**
     * Look for the smallest element in the given array from index {@code start} to {@code stop},
     * inclusive.
     *
     * @param arr   The array to check.
     * @param start The starting index to check, inclusive.
     * @param stop  The last index to check, inclusive.
     * @return The index at which the element with the lowest value lies.
     */
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
