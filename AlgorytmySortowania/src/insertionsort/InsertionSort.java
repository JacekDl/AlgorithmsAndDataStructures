package insertionsort;

import java.util.List;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

//TODO please rename polish -> english 
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
		generator.generateRandomNumbers(16, 100);

		int list[] = generator.generateRandomNumbers(16, 100);


		//Prints list before sorting.
		System.out.print("Originalna lista: ");
		ArrayLogger.log(list);

		//Insertion sort.
		sorting.sortByInsertion(null);

		//Prints sorted list.
		System.out.print("Posortowana lista: ");
		ArrayLogger.log(list);

	}

}
