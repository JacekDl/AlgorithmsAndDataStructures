package algorithms.sortingalgorithms.countingsort;

public class CountingSort {

	public int[] sortByCounting(int[] array) {
		
		int range = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > range) range = array[i];
		}
		
		int[] cArray = new int[range + 1];
		
		for(int i = 0; i < array.length; i++) {
			cArray[array[i]] = cArray[array[i]] + 1;
		}
		
		for(int i = 1; i < cArray.length; i++) {
			cArray[i] = cArray[i] + cArray[i-1];
		}
		
		int[] bArray = new int[array.length];
		for(int j = array.length - 1; j >= 0 ; j--) {
			bArray[cArray[array[j]]-1] = array[j];
			cArray[array[j]] = cArray[array[j]] - 1;
		}
		
		return bArray;
	}
}
