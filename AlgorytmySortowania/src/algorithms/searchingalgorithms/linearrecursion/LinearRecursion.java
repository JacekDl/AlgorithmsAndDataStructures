package algorithms.searchingalgorithms.linearrecursion;

public class LinearRecursion {

    // Prepares data for analysis by linearSearchRecursion.
    public int linearSearchWithRecursion(int list[], int searchedvalue) {
        int answer = linearSearchRecursion(list, list.length - 1, 0, searchedvalue);
        return answer;
    }

    // Searches list recursively.
    private int linearSearchRecursion(int list[], int n, int i, int value) {
        if (i > n) {
            return -1;
        } else if (i <= n && list[i] == value) {
            return i;
        }
        return linearSearchRecursion(list, n, i + 1, value);

    }
}

