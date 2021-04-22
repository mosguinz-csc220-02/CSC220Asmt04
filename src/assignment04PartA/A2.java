package assignment04PartA;

import java.util.Arrays;

public class A2 {

    public static int[] numbers = {9, 1, 2, 4, 3, 5, 6, 2, 9, 8, 5, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers, true);
        System.out.println(Arrays.toString(numbers));

    }

    public static void insertionSort(int[] arr, boolean verbose) {
        int start = 0;
        int stop = arr.length - 1;

        for (int i = start + 1; i <= stop; i++) {
            int elementToInsert = arr[i];
            int index = i - 1;

            while ((index >= start) && (elementToInsert < arr[index])) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = elementToInsert;
        }
    }

}