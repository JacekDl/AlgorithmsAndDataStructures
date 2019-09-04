package algorithms.searchingalgorithms.binarysearch;

import logging.ArrayLogger;
import logging.ValueLogger;
import algorithms.sortingalgorithms.selectionsort.*;
import testdata.TestDataGenerator;

public class BinarySearchTest {
	public static void main(String[] args) {

		// TODO Jacek - please refactor as it is in InsertionSort --> Jacek: done
		// Searched value.
		// int value = 25;

		// Generates list of random values.
		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(20, 100);
		// Generates a random value.
		int value = generator.generateRandomValue(100);

		// Prints searched value.
		ValueLogger.logValue(value);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(somelist);

		// Sorts list.
		SelectionSort sort = new SelectionSort();
		sort.sortBySelection(somelist);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(somelist);

		// Searches list binarily.
		BinarySearch search = new BinarySearch();
		search.searchBinarily(somelist, value);

	}
}
