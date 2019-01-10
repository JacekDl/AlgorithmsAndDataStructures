package insertionsort;

import binarysearch.BinarySearch;
import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class InsertionSortTest {
	public static void main(String[] args) {

		InsertionSort sorting = new InsertionSort();

		TestDataGenerator generator = new TestDataGenerator();
		// generator.generateRandomNumbers(16, 100);

		int[] newlist = generator.generateRandomNumbers(20, 100);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(newlist);

		// Insertion sort.
		sorting.sortByInsertion(newlist);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(newlist);

		// Uses object type BinarySearch to find a value on the sorted list.
		// int value = 12;
		// BinarySearch search = new BinarySearch();
		// search.searchBinarily(newlist, value);

	}
}
