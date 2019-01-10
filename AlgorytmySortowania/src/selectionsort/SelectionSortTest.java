package selectionsort;

import binarysearch.BinarySearch;
import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class SelectionSortTest {
	public static void main(String[] args) {

		// TODO Jacek - please refactor as it is in InsertionSort --> Jacek: done

		// Creates new reference/local variable 'sorting' and links it with object type
		// SelectionSort.
		SelectionSort sorting = new SelectionSort();

		TestDataGenerator generator = new TestDataGenerator();
		int[] newlist = generator.generateRandomNumbers(20, 100);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(newlist);

		sorting.sortBySelection(newlist);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(newlist);

		// Uses object type BinarySearch to find a value on the sorted list.
		 int value = 12;
		 BinarySearch search = new BinarySearch();
		 search.searchBinarily(newlist, value);

	}
}
