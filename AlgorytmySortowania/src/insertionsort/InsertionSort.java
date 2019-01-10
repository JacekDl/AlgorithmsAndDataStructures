package insertionsort;

import java.util.List;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

//TODO please rename polish -> english; Jacek: done.
public class InsertionSort {

	public void sortByInsertion(int[] list) {

		for(int i = 1;i<list.length;i++) {
			int key = list[i];
			int j = i - 1;
			while(j>-1 && list[j]>key) {
				list[j+1]=list[j];
				j--;
			}
			list[j+1]=key;
		}
	}

	// example - short, meaningful methods
	private void doSmth(List<Integer> list) {
		if(isEmpty(list)) {
			//do smth
		}
	}

	private static boolean isEmpty(List<Integer> list) {
		return list == null || list.size() == 0;
	}	

	public static void main(String[] args) {

		InsertionSort sorting = new InsertionSort();

		TestDataGenerator generator = new TestDataGenerator();
		//generator.generateRandomNumbers(16, 100);

		int[] newList = generator.generateRandomNumbers(16, 100);


		//Prints list before sorting.
		System.out.print("List before sorting: ");
		ArrayLogger.log(newList);

		//Insertion sort.
		sorting.sortByInsertion(newList);

		//Prints sorted list.
		System.out.print("Sorted list: ");
		ArrayLogger.log(newList);

	}

}
