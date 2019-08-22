package algorithms.sortingalgorithms.insertionsort;

//import binarysearch.BinarySearch;
import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class InsertionSortTest {
	public static void main(String[] args) {

		TestDataGenerator generator = new TestDataGenerator();
		int[] myArray = generator.generateRandomNumbers(10, 20);

		// Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(myArray);

		InsertionSort sorting = new InsertionSort();
		// Insertion sort.
		sorting.sortByInsertion(myArray);

		// Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(myArray);

		// Uses object type BinarySearch to find a value on the sorted list.
		// int value = 12;
		// BinarySearch search = new BinarySearch();
		// search.searchBinarily(newlist, value);

	}
}
