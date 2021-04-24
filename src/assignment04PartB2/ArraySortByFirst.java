package assignment04PartB2;

/**
 * Part B.2
 * <p>
 * Please do not change any code in the main method
 */
public class ArraySortByFirst {

    /**
     * Insertion sort, but with 2D array. Sorted by the zeroth element.
     *
     * @param data The N by N 2D array to sort.
     */
    public static void sortByFirst(int[][] data) {
        int start = 0;
        int stop = data.length - 1;

        for (int i = start + 1; i <= stop; i++) {
            int[] elementToInsert = data[i];
            int index = i - 1;

            while ((index >= start) && (elementToInsert[0] < data[index][0])) {
                data[index + 1] = data[index];
                index--;
            }
            data[index + 1] = elementToInsert;
        }
    }

    public static void display(int data[][]) {
        for (int[] row : data) {
            System.out.print("     ");
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // @formatter:off
	// Please do not change any code in the main method
	//
	public static void main(String args[])
	{
		int array[][] = {{1, 2, 3, 4, 5},
				 {3, 4, 5, 1, 2},
				 {5, 2, 3, 4, 1},
				 {2, 3, 1, 4, 5},
				 {4, 2, 3, 1, 5}};

		System.out.println("The array is initially " );
		display(array);
		System.out.println();

		sortByFirst(array);
		System.out.println("The array after sorting is " );
		display(array);
		System.out.println();
	}
}