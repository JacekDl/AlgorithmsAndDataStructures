package algorithms.sortingalgorithms;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class BubbleSortTest {

	public static void main(String[] args) {

		TestDataGenerator generator = new TestDataGenerator();
		int[] newlist = generator.generateRandomNumbers(10, 100);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(newlist);

		BubbleSort sort = new BubbleSort();
		sort.sortBubbly(newlist);
		
		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(newlist);
	}

}
