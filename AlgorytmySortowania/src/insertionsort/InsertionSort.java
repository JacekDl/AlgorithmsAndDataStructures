package insertionsort;

import java.util.List;

//TODO please rename polish -> english; Jacek: done.
public class InsertionSort {

	public void sortByInsertion(int[] list) {

		for (int i = 1; i < list.length; i++) {
			int key = list[i];
			int j = i - 1;
			while (j > -1 && list[j] > key) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}
	}

	// example - short, meaningful methods
	/*
	 * private void doSmth(List<Integer> list) { if (isEmpty(list)) { // do smth } }
	 */

	private static boolean isEmpty(List<Integer> list) {
		return list == null || list.size() == 0;
	}

}
