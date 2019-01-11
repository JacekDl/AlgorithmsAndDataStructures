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
		somelist[somelist.length - 1] = value; // Zast�puje ostatni element listy warto�ci� poszukiwan�.

		// Por�wnuje zawarto�� listy z warto�ci� poszukiwan�.
		// Zwraca i gdy znajdzie warto�� poszukiwan� lub gdy dojdzie do ostatniego
		// elementu listy.
		int i = 0;
		while (somelist[i] != value) {
			i++;
		}

		// Przywraca pierwotn� warto�� ostatniego elementu listy i tym samym pierwotny
		// kszta�t listy.
		somelist[somelist.length - 1] = last;

		// Je�li poszukiwana warto�� zosta�a znaleziona przed dotarciem do ostatniego
		// elementu listy,
		// lub gdy ostatni element przywr�conej listy jest poszukiwan� warto�ci�,
		// wy�wietla komunikat powodzenia wyszukiwania.
		if (i < somelist.length - 1 || somelist[somelist.length - 1] == value) {
			System.out.print("Wyszukiwana warto�� znajduje si� pod indeksem nr: " + i);
			// W przeciwnym razie wy�wietla niepowodzenie wyszukiwania.
		} else {
			System.out.print("Wyszukiwana warto�� nie znajduje si� na li�cie.");
		}

	}

}
