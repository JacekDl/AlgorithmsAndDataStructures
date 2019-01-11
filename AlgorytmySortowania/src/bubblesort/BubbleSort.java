package bubblesort;

public class BubbleSort {

	public void sortBubbly(int[] array) {
		int t;
		
		for (int a = 1; a < array.length; a++) {
			for (int b = array.length - 1; b >= a; b--) {
				if (array[b - 1] > array[b]) {
					t = array[b - 1];
					array[b - 1] = array[b];
					array[b] = t;
				}
			}
		}
	}
}
