package binarysearch;

//TODO please rename polish -> english 
public class BinarySearch {

	public static void main(String[] args) {
		
		//TODO Jacek - please refactor as it is in SortowaniePrzezWstawianie
		
		//New sorted list.
		int list[] = new int[16];  
		list[0] = -1;
		list[1] = 2;
		list[2] = 4;
		list[3] = 5;
		list[4] = 8;
		list[5] = 10;
		list[6] = 14;
		list[7] = 24;
		list[8] = 35;
		list[9] = 37;
		list[10] = 42;
		list[11] = 47;
		list[12] = 53;
		list[13] = 60;
		list[14] = 71;
		list[15] = 82;

		int p = 0;
		int r = list.length-1;
		int q;
		int value = 2;

		while (p <= r) {
			q = Math.floorDiv(p+r, 2);
			/*System.out.println("Wartoœæ p: " + p);
			System.out.println("Wartoœæ q: " + q);
			System.out.println("Wartoœæ r: " + r);
			System.out.println("");*/
			if (list[q] == value) {
				System.out.print("Searched value position on the list: " + q);
				break;
			}else if(list[q] > value) {
				r = q-1;
			}else if(list[q] < value) {
				p = q+1;
			}
			//Wyœwietla komunikat o niepowodzeniu wyszukiwania.
			if (list[q] != value && p > r) {
				System.out.println("Searched value is not on the list.");
				break;
			}
		}	
	}
}
