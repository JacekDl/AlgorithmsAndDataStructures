package algorithms.searchingalgorithms;

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

		// Creates reference type SentinelLinearSearch and links it with new object
		// 'next'.
		SentinelLinearSearch next = new SentinelLinearSearch();
		int answer = next.searchLinearlyWithSentinel(somelist, value);

		// Prints results of search.
		if (answer < somelist.length - 1 || somelist[somelist.length - 1] == value) {
			System.out.print("Searched value position number: " + answer);
		} else {
			System.out.print("Searched value is not on the list.");
		}

	}

}
