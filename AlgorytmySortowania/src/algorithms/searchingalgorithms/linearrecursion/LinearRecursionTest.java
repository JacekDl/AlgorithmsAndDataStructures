package linearrecursion;

import logging.ArrayLogger;
import logging.ValueLogger;
import testdata.TestDataGenerator;

public class LinearRecursionTest {

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

		// Creates reference next and links it with new object of LinearRecursion class.
		LinearRecursion next = new LinearRecursion();
		// Creates new variable answer of value of outcome of method linearSearch.
		int answer = next.linearSearchWithRecursion(somelist, value);
		// Prints the value of search. 
		if (answer == -1) {
			System.out.print("Searched value is not on the list.");
		} else {
			System.out.print("Searched value position number:  " + answer);
		}

	}
}
