package sortowanieprzezwybieranie;

//TODO please rename polish -> english 
public class SortowaniePrzezWybieranie {

	public static void main(String[] args) {
		
		//TODO Jacek - please refactor as it is in SortowaniePrzezWstawianie
		int Lista[] = new int[16];  
		Lista[0] = 52;
		Lista[1] = 82;
		Lista[2] = 4;
		Lista[3] = 37;
		Lista[4] = -150;
		Lista[5] = -20;
		Lista[6] = 14;
		Lista[7] = 60;
		Lista[8] = 13;
		Lista[9] = 35;
		Lista[10] = -42;
		Lista[11] = 8;
		Lista[12] = -1;
		Lista[13] = 24;
		Lista[14] = 10;
		Lista[15] = -2;
		
		//Wy�wietla originaln� list� - przed posortowaniem.
		System.out.print("Originalna lista: ");
		for(int i =0;i<Lista.length;i++) {	
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");
		
		//Sortuje list�.
		for(int i = 0; i < Lista.length-1; i++) {
			int najmniejszy = i;
			for(int j = i+1; j< Lista.length;j++) {
				if(Lista[j]<Lista[najmniejszy]) {
					najmniejszy = j;
				}
			}
			int extra = Lista[i];
			Lista[i] = Lista[najmniejszy];
			Lista[najmniejszy] = extra;
		}
		
		//Wy�wietla posortowan� list�.
		System.out.print("Posortowana lista: ");
		for (int i=0; i <Lista.length;i++) {
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");
		
		/*//Wyszukuje warto�� binarnie.
		int p = 0;
		int r = Lista.length-1;
		int q;
		int wyszukiwanaWartosc = 60;

		while (p <= r) {
			q = Math.floorDiv(p+r, 2);
			System.out.println("Warto�� p: " + p);
			System.out.println("Warto�� q: " + q);
			System.out.println("Warto�� r: " + r);
			System.out.println("");
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
		}	*/
	}

}
