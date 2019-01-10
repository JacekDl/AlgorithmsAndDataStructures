package binarysearch;

import logging.ArrayLogger;
import selectionsort.SelectionSort;
import testdata.TestDataGenerator;

public class BinarySearchTest {
	public static void main(String[] args) {

		// TODO Jacek - please refactor as it is in InsertionSort --> Jacek: done
		//Searched value.
		int value = 25;

		//Generates list of random values.
		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(20, 200);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(somelist);

		//Sorts list.
		SelectionSort sort = new SelectionSort();
		sort.sortBySelection(somelist);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(somelist);

		//Searches list binarily.
		BinarySearch search = new BinarySearch();
		search.searchBinarily(somelist, value);

	}
}
