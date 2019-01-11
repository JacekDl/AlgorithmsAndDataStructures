package betterlinear;

public class BetterLinear {

	public int searchBetterLinearly(int[] list, int value) {
		int answer = -1;
		for (int i=0; i<list.length; i++) {
			if (list[i] == value) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
