package algorithms.sortingalgorithms;

public class InsertionSort<T> {

	public void sortByInsertion(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int key = array[i];						//assigns key to value from array
			int j = i - 1;							//first value to be compared with the key - i-1 (next to the left)
			while (j > -1 && array[j] > key) {		
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
	
	// example - short, meaningful methods
	/*
	 * private void doSmth(List<Integer> list) { if (isEmpty(list)) { // do smth } }
	 */

	/*private static boolean isEmpty(List<Integer> list) {
		return list == null || list.size() == 0;
	}
	 */
}
