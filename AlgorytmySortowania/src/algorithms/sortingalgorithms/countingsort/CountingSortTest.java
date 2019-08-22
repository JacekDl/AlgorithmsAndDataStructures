package algorithms.sortingalgorithms.countingsort;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class CountingSortTest {

	public static void main(String[] args) {

		TestDataGenerator generator = new TestDataGenerator();
		int[] myArray = generator.generateRandomNumbers(20, 10);

		// Prints list before sorting.
		System.out.print("Array before sorting: ");
		ArrayLogger.log(myArray);

		CountingSort cSort = new CountingSort();
		//cSort.sortByCounting(myArray); 			//that didn't work; check next line;
		myArray = cSort.sortByCounting(myArray);
		
		// Prints sorted list.
		System.out.print("Sorted array: ");
		ArrayLogger.log(myArray);
	}

}
