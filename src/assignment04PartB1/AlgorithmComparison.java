package assignment04PartB1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class AlgorithmComparison {

    public static void main(String[] args) {
        // Set this to true for CSV output.
        boolean printToCsv = true;

        // Path to output CSV file.
        String fileName = "./src/assignment04PartB1/algo.csv";

        // Disable print to console; reduce lag.
        boolean printToConsole = true;

        // `n` number of tests. 1 to `n`, inclusive.
        // DIFFERENT RANDOMLY-GENERATED ARRAYS FOR EACH RUN.
        int runs = 10000;

        // Max array size for each test.
        int maxArrSize = 10000;

        /* Spaghetti below ************************************************************************/
        String humanFormat = "[n = %-8d] %-15s ns vs %-15s ns%n";
        String csvFormat = "%d,%d,%d%n";
        PrintWriter fOut = null;

        try {
            fOut = new PrintWriter(fileName);
            fOut.println("n,Algorithm A (ns),Algorithm B (ns)");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        for (int n = 1; n <= runs; n++) {
            long start, stop, deltaA, deltaB;
            int[] arr = generateRandomInts(maxArrSize);

            // Time loop A
            start = System.nanoTime();
            algoA(arr);
            stop = System.nanoTime();
            deltaA = stop - start;

            // Time loop B
            start = System.nanoTime();
            algoB(arr);
            stop = System.nanoTime();
            deltaB = stop - start;

            // Output in csv format
            if (printToCsv) {
                fOut.printf(csvFormat, n, deltaA, deltaB);
            }

            if (!printToConsole) {
                continue;
            }

            // Output for human eyes
            if (deltaA < deltaB) {
                System.out.printf(humanFormat, n, colorFaster(deltaA), colorSlower(deltaB));
            } else {
                System.out.printf(humanFormat, n, colorSlower(deltaA), colorFaster(deltaB));
            }
        }
        fOut.close();
    }

    private static String colorFaster(long d) {
        return "\033[0;32m" + d + "\033[0m";
    }

    private static String colorSlower(long d) {
        return "\033[0;31m" + d + "\033[0m";
    }

    private static int[] generateRandomInts(int size) {
        int[] randInts = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randInts[i] = rand.nextInt((int) 2e32);
        }
        return randInts;
    }

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
