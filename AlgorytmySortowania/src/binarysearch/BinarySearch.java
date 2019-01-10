package binarysearch;

//TODO please rename polish -> english Jacek:done
public class BinarySearch {

	public void searchBinarly(int[] list, int value) {
		int p = 0;
		int r = list.length - 1;
		int q;
		while (p <= r) {
			q = Math.floorDiv(p + r, 2);
			/*
			 * System.out.println("Wartoœæ p: " + p); System.out.println("Wartoœæ q: " + q);
			 * System.out.println("Wartoœæ r: " + r); System.out.println("");
			 */
			if (list[q] == value) {
				System.out.print("Searched value position on the list: " + q);
				break;
			} else if (list[q] > value) {
				r = q - 1;
			} else if (list[q] < value) {
				p = q + 1;
			}
			//Prints information if search is unsuccessful.
			if (list[q] != value && p > r) {
				System.out.println("Searched value is not on the list.");
				break;
			}
		}
	}
	public static void main(String[] args) {

		// TODO Jacek - please refactor as it is in InsertionSort

		// New sorted list.
		int somelist[] = new int[16];
		somelist[0] = -1;
		somelist[1] = 2;
		somelist[2] = 4;
		somelist[3] = 5;
		somelist[4] = 8;
		somelist[5] = 10;
		somelist[6] = 14;
		somelist[7] = 24;
		somelist[8] = 35;
		somelist[9] = 37;
		somelist[10] = 42;
		somelist[11] = 47;
		somelist[12] = 53;
		somelist[13] = 60;
		somelist[14] = 71;
		somelist[15] = 82;

		int value = 4;
		
		BinarySearch search = new BinarySearch();
		search.searchBinarly(somelist, value);
		
	}
}
