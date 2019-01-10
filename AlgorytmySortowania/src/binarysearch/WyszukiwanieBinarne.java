package binarysearch;

//TODO please rename polish -> english 
public class WyszukiwanieBinarne {

	public static void main(String[] args) {
		
		//TODO Jacek - please refactor as it is in SortowaniePrzezWstawianie
		
		//Tworzy posortowan� (niemalej�c�) list�.
		int Lista[] = new int[16];  
		Lista[0] = -1;
		Lista[1] = 2;
		Lista[2] = 4;
		Lista[3] = 5;
		Lista[4] = 8;
		Lista[5] = 10;
		Lista[6] = 14;
		Lista[7] = 24;
		Lista[8] = 35;
		Lista[9] = 37;
		Lista[10] = 42;
		Lista[11] = 47;
		Lista[12] = 53;
		Lista[13] = 60;
		Lista[14] = 71;
		Lista[15] = 82;

		int p = 0;
		int r = Lista.length-1;
		int q;
		int wyszukiwanaWartosc = -5;

		while (p <= r) {
			q = Math.floorDiv(p+r, 2);
			/*System.out.println("Warto�� p: " + p);
			System.out.println("Warto�� q: " + q);
			System.out.println("Warto�� r: " + r);
			System.out.println("");*/
			if (Lista[q] == wyszukiwanaWartosc) {
				System.out.print("Poszukiwana warto�� znajduje si� na pozycji nr: " + q);
				break;
			}else if(Lista[q] > wyszukiwanaWartosc) {
				r = q-1;
			}else if(Lista[q] < wyszukiwanaWartosc) {
				p = q+1;
			}
			//Wy�wietla komunikat o niepowodzeniu wyszukiwania.
			if (Lista[q] != wyszukiwanaWartosc && p > r) {
				System.out.println("Poszukiwanej warto�ci nie ma na li�cie.");
				break;
			}
		}	
	}
}
