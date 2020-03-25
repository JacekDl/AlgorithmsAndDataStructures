package algorithms.sortingalgorithms;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class QuickSortTest {

	public static void main(String[] args) {

		TestDataGenerator generator = new TestDataGenerator();
		int[] newlist = generator.generateRandomNumbers(20, 100);
		int p = 1;
		int r = newlist.length - 1;

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(newlist);

		// Quicksort.
		QuickSort sorting = new QuickSort();
		sorting.sortByQuickSort(newlist, p, r);

		
		
		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(newlist);

	}

}
