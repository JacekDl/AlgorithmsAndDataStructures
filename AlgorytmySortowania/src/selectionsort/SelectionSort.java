package selectionsort;

//TODO please rename polish -> english. Jacek: done
public class SelectionSort {

	public static void main(String[] args) {
		
		//TODO Jacek - please refactor as it is in InsertionSort
		int list[] = new int[16];  
		list[0] = 52;
		list[1] = 82;
		list[2] = 4;
		list[3] = 37;
		list[4] = -150;
		list[5] = -20;
		list[6] = 14;
		list[7] = 60;
		list[8] = 13;
		list[9] = 35;
		list[10] = -42;
		list[11] = 8;
		list[12] = -1;
		list[13] = 24;
		list[14] = 10;
		list[15] = -2;
		
		//Prints list before sorting.
		System.out.print("List before sorting: ");
		for(int i =0;i<list.length;i++) {	
			System.out.print(list[i] + " ");
		}
		System.out.println("");
		
		//Sorts list.
		for(int i = 0; i < list.length-1; i++) {
			int min = i;
			for(int j = i+1; j< list.length;j++) {
				if(list[j]<list[min]) {
					min = j;
				}
			}
			int l = list[i];
			list[i] = list[min];
			list[min] = l;
		}
	
		
		//Prints sorted list.
		System.out.print("Sorted list: ");
		for (int i=0; i <list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("");
		
		/*//Wyszukuje wartoœæ binarnie.
		int p = 0;
		int r = Lista.length-1;
		int q;
		int wyszukiwanaWartosc = 60;

		while (p <= r) {
			q = Math.floorDiv(p+r, 2);
			System.out.println("Wartoœæ p: " + p);
			System.out.println("Wartoœæ q: " + q);
			System.out.println("Wartoœæ r: " + r);
			System.out.println("");
			if (Lista[q] == wyszukiwanaWartosc) {
				System.out.print("Poszukiwana wartoœæ znajduje siê na pozycji nr: " + q);
				break;
			}else if(Lista[q] > wyszukiwanaWartosc) {
				r = q-1;
			}else if(Lista[q] < wyszukiwanaWartosc) {
				p = q+1;
			}
			//Wyœwietla komunikat o niepowodzeniu wyszukiwania.
			if (Lista[q] != wyszukiwanaWartosc && p > r) {
				System.out.println("Poszukiwanej wartoœci nie ma na liœcie.");
				break;
			}
		}	*/
	}

}
