package sentinellinearsearch;

import logging.ArrayLogger;
import logging.ValueLogger;
import testdata.TestDataGenerator;

public class SentinelLinearSearchTest {

	public static void main(String[] args) {
		// Generates list of random values.
		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(20, 100);

		// Generates a random value.
		int value = generator.generateRandomValue(100);

		// Prints random list.
		System.out.print("Searched list: ");
		ArrayLogger.log(somelist);

		// Prints searched value.
		ValueLogger.logValue(value);

		
		// Podstawia ostatni element listy do zmiennej 'last'.
		int last = somelist[somelist.length - 1]; 
		somelist[somelist.length - 1] = value; // Zastêpuje ostatni element listy wartoœci¹ poszukiwan¹.

		// Porównuje zawartoœæ listy z wartoœci¹ poszukiwan¹.
		// Zwraca i gdy znajdzie wartoœæ poszukiwan¹ lub gdy dojdzie do ostatniego
		// elementu listy.
		int i = 0;
		while (somelist[i] != value) {
			i++;
		}

		// Przywraca pierwotn¹ wartoœæ ostatniego elementu listy i tym samym pierwotny
		// kszta³t listy.
		somelist[somelist.length - 1] = last;

		// Jeœli poszukiwana wartoœæ zosta³a znaleziona przed dotarciem do ostatniego
		// elementu listy,
		// lub gdy ostatni element przywróconej listy jest poszukiwan¹ wartoœci¹,
		// wyœwietla komunikat powodzenia wyszukiwania.
		if (i < somelist.length - 1 || somelist[somelist.length - 1] == value) {
			System.out.print("Wyszukiwana wartoœæ znajduje siê pod indeksem nr: " + i);
			// W przeciwnym razie wyœwietla niepowodzenie wyszukiwania.
		} else {
			System.out.print("Wyszukiwana wartoœæ nie znajduje siê na liœcie.");
		}

	}

}
