package betterlinear;

public class BetterLinear {

    public int searchBetterLinearly(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return list[i];
            }
        }
        return -1;
    }
}
