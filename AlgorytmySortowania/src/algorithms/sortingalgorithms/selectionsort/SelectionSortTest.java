package algorithms.sortingalgorithms.selectionsort;

import algorithms.searchingalgorithms.binarysearch.*;
import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class SelectionSortTest {
	public static void main(String[] args) {

		//1) input: null
		//2) input: []
		//3) input: [1]
		//4) input: [1,-2]
		//5) input: [1,-2,3,2,1,56,3,-2,0]
		//6) input: [1,2,3,4,5,6,7,8]
		//7) input: [8,7,6,5,4,3,2,1]

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
