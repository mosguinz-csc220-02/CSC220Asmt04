package assignment04PartB1;

public class AlgorithmComparison {

    /**
     * "Algorithm A searches the entire array sequentially and records the largest entry seen so
     * far."
     *
     * @param arr The array of integer to sort. Assumes all elements are >= 0.
     * @return The largest entry.
     */
    private static int algoA(int[] arr) {
        int largest = -1;
        for (int i : arr) {
            largest = Math.max(i, largest);
        }

        return largest;
    }

    /**
     * "Algorithm B sorts the array into descending order and then reports the first entry as the
     * largest."
     *
     * @param arr The array of integer to sort. Assumes all elements are >= 0.
     * @return The largest entry.
     */
    private static int algoB(int[] arr) {
        int start = 0;
        int stop = arr.length - 1;

        /* Insertion sort, descending */
        for (int i = start + 1; i <= stop; i++) {
            int elementToInsert = arr[i];
            int index = i - 1;

            while ((index >= start) && (elementToInsert > arr[index])) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = elementToInsert;
        }

        return arr[0];
    }

}
