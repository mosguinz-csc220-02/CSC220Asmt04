package assignment04PartB2;

/**
 * Part B.2
 * <p>
 * Please do not change any code in the main method
 */
public class ArraySortByFirst {

    public static void sortByFirst(int data[][]) {
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