package binarysearch;

import logging.ArrayLogger;
import selectionsort.SelectionSort;
import testdata.TestDataGenerator;

public class BinarySearchTest {
	public static void main(String[] args) {

		// TODO Jacek - please refactor as it is in InsertionSort
		int value = 25;

		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(20, 200);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(somelist);

		SelectionSort sort = new SelectionSort();
		sort.sortBySelection(somelist);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(somelist);

		/*
		 * // New sorted list. int somelist[] = new int[16]; somelist[0] = -1;
		 * somelist[1] = 2; somelist[2] = 4; somelist[3] = 5; somelist[4] = 8;
		 * somelist[5] = 10; somelist[6] = 14; somelist[7] = 24; somelist[8] = 35;
		 * somelist[9] = 37; somelist[10] = 42; somelist[11] = 47; somelist[12] = 53;
		 * somelist[13] = 60; somelist[14] = 71; somelist[15] = 82;
		 */

		BinarySearch search = new BinarySearch();
		search.searchBinarly(somelist, value);

	}
}
