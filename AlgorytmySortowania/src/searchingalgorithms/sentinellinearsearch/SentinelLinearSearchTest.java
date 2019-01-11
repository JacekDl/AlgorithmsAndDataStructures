package sentinellinearsearch;

public class SentinelLinearSearchTest {

	public static void main(String[] args) {
		int Lista[] = new int[12];
		Lista[0] = 15;
		Lista[1] = 23;
		Lista[2] = 24;
		Lista[3] = 125;
		Lista[4] = 18;
		Lista[5] = 56;
		Lista[6] = 2;
		Lista[7] = 24;
		Lista[8] = 35;
		Lista[9] = 21;
		Lista[10] = 25;
		Lista[11] = 81;
		
		
		System.out.println(Lista.length);				//Wyœwietla d³ugoœæ listy.
		int wyszukiwanaWartosc = 21;					//Poszukiwana wartoœæ.
		int ostatni = Lista[Lista.length-1];			//Podstawia ostatni element listy do zmiennej 'ostatni'.
		Lista[Lista.length-1] = wyszukiwanaWartosc;		//Zastêpuje ostatni element listy wartoœci¹ poszukiwan¹.
		
		//Porównuje zawartoœæ listy z wartoœci¹ poszukiwan¹.
		//Zwraca i gdy znajdzie wartoœæ poszukiwan¹ lub gdy dojdzie do ostatniego elementu listy.
		int i = 0;
		while (Lista[i] != wyszukiwanaWartosc) {
			i++;
		}
		
		//Przywraca pierwotn¹ wartoœæ ostatniego elementu listy i tym samym pierwotny kszta³t listy.
		Lista[Lista.length-1] = ostatni;
		
		//Jeœli poszukiwana wartoœæ zosta³a znaleziona przed dotarciem do ostatniego elementu listy,
		//lub gdy ostatni element przywróconej listy jest poszukiwan¹ wartoœci¹,
		//wyœwietla komunikat powodzenia wyszukiwania.
		if (i<Lista.length-1 || Lista[Lista.length-1] == wyszukiwanaWartosc) {
			System.out.print("Wyszukiwana wartoœæ znajduje siê pod indeksem nr: " + i);
		//W przeciwnym razie wyœwietla niepowodzenie wyszukiwania.
		}else {
			System.out.print("Wyszukiwana wartoœæ nie znajduje siê na liœcie.");
		}
		
		
		

	}

}
