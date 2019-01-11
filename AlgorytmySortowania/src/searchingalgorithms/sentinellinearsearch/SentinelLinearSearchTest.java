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
		
		
		System.out.println(Lista.length);				//Wy�wietla d�ugo�� listy.
		int wyszukiwanaWartosc = 21;					//Poszukiwana warto��.
		int ostatni = Lista[Lista.length-1];			//Podstawia ostatni element listy do zmiennej 'ostatni'.
		Lista[Lista.length-1] = wyszukiwanaWartosc;		//Zast�puje ostatni element listy warto�ci� poszukiwan�.
		
		//Por�wnuje zawarto�� listy z warto�ci� poszukiwan�.
		//Zwraca i gdy znajdzie warto�� poszukiwan� lub gdy dojdzie do ostatniego elementu listy.
		int i = 0;
		while (Lista[i] != wyszukiwanaWartosc) {
			i++;
		}
		
		//Przywraca pierwotn� warto�� ostatniego elementu listy i tym samym pierwotny kszta�t listy.
		Lista[Lista.length-1] = ostatni;
		
		//Je�li poszukiwana warto�� zosta�a znaleziona przed dotarciem do ostatniego elementu listy,
		//lub gdy ostatni element przywr�conej listy jest poszukiwan� warto�ci�,
		//wy�wietla komunikat powodzenia wyszukiwania.
		if (i<Lista.length-1 || Lista[Lista.length-1] == wyszukiwanaWartosc) {
			System.out.print("Wyszukiwana warto�� znajduje si� pod indeksem nr: " + i);
		//W przeciwnym razie wy�wietla niepowodzenie wyszukiwania.
		}else {
			System.out.print("Wyszukiwana warto�� nie znajduje si� na li�cie.");
		}
		
		
		

	}

}
