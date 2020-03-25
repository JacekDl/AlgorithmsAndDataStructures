package algorithms.searchingalgorithms;

public class LinearSearch {

	public int searchLinearly(int[] list, int value) {
		int answer = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == value) {
				answer = i;
			}
		}
		return answer;
	}

}
