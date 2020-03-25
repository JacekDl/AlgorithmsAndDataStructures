package algorithms.sortingalgorithms;

//TODO please rename polish -> english. Jacek: done
public class SelectionSort {

	public void sortBySelection(int[] list) { // Question: why is this method VOID? It returns sorted list though.
		// Sorts list.
		for (int i = 0; i < list.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[min]) {
					min = j;
				}
			}
			int l = list[i];
			list[i] = list[min];
			list[min] = l;
		}
	}

	

}
