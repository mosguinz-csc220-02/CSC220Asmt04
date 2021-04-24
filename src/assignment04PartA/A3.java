package assignment04PartA;

import java.util.Arrays;

public class A3 {

    public static int[] numbers = {9, 1, 2, 4, 3, 5, 6, 2, 9, 8, 5, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        shellSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void shellSort(int[] arr) {
        int start = 0;
        int stop = arr.length - 1;
        int n = stop - start + 1;
        int space = n / 2;

        while (space > 0) {
            for (int i = start; i < start + space; i++) {
                incrInsertionSort(arr, i, stop, space);
            }
            space = space / 2;
        }
    }

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
