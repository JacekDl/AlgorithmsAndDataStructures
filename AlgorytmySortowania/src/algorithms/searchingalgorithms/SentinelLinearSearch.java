package algorithms.searchingalgorithms;

public class SentinelLinearSearch {

	public int searchLinearlyWithSentinel(int[] list, int value) {
		// Value of variable 'last' is the value of last element of the list.
		int last = list[list.length - 1]; 
		list[list.length - 1] = value; // Changes value of the last element on the list to the searched value.

		// Compares list with searched value.
		// Returns i if searched value is found or if reached the last element of the list (sentinel).
		int i = 0;
		while (list[i] != value) {
			i++;
		}

		// Restores original value of the last element of the list.
		list[list.length - 1] = last;
		return i;
	}
	

}
