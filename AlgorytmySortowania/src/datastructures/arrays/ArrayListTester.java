package arrays;

import java.util.List;

import bubblesort.BubbleSort;
import insertionsort.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class ArrayListTester {

	public static void main(String[] args) {

		// TestDataGenerator generator1 = new TestDataGenerator();
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(12);
		array1.add(7);
		array1.add(14);
		array1.add(23);

		ArrayLogger logger = new ArrayLogger();
		logger.logArrayList(array1);
	
		array1.sort(null);
		logger.logArrayList(array1);

		array1.add(13);
		logger.logArrayList(array1);
		
		array1.sort(null);
		logger.logArrayList(array1);

		array1.remove(4);
		logger.logArrayList(array1);
		
		int[] array2 = new int[] {4,-5,1};
		int[] array3 = new int[] {1,-5,4};
		logger.log(array2);
		logger.log(array3);
		
		if (Arrays.equals(array2, array3)) {
			System.out.println("The contents of arrays is identical.");
		}else {
			System.out.println("Arrays are different.");
		}
		
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.binarySearch(array2, -5));
		
		/*BubbleSort sort = new BubbleSort();
		sort.sortBubbly(array3);*/
		
		/*InsertionSort sorting = new InsertionSort();
		sorting.sortByInsertion(array3);*/
		
		System.out.println(Arrays.toString(array3));
	}
	
	

}
