package assignment04PartA;

import java.util.Arrays;

public class A3 {

    public static int[] numbers = {9, 1, 2, 4, 3, 5, 6, 2, 9, 8, 5, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        shellSort(numbers, true);
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * Perform a Shell sort on the given array of numbers.
     *
     * @param arr     The array to sort.
     * @param verbose If {@code true}, prints the array each time an element has been sorted
     *                (re-numerating on each split).
     */
    public static void shellSort(int[] arr, boolean verbose) {
        int start = 0;
        int stop = arr.length - 1;
        int n = stop - start + 1;
        int space = n / 2;

        while (space > 0) {
            for (int i = start; i < start + space; i++) {
                incrInsertionSort(arr, i, stop, space);

                if (verbose) {
                    System.out.printf("%4d: %s%n", i + 1, Arrays.toString(arr));
                }
            }
            space = space / 2;
        }
    }

    /**
     * Perform insertion sort on divided segments of the array.
     *
     * @param arr       The segment to sort.
     * @param incrStart The first index to start sorting, where this index is incremented on each
     *                  segment.
     * @param stop      The last index to sort, inclusive.
     * @param space     The equally-spaced length between each index.
     */
    private static void incrInsertionSort(int[] arr, int incrStart, int stop, int space) {
        int unsorted, index;

        for (unsorted = incrStart + space; unsorted <= stop; unsorted = unsorted + space) {
            int elementToInsert = arr[unsorted];
            index = unsorted - space;

            while ((index >= incrStart) && (elementToInsert < arr[index])) {
                arr[index + space] = arr[index];
                index = index - space;
            }
            arr[index + space] = elementToInsert;
        }
    }
}
