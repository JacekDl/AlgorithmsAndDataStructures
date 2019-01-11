package binarysearch;

//TODO please rename polish -> english Jacek:done
public class BinarySearch {

	public void searchBinarily(int[] list, int value) {
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
			// Prints information if search is unsuccessful.
			if (list[q] != value && p > r) {
				System.out.println("Searched value is not on the list.");
				break;
			}
		}
	}

}
