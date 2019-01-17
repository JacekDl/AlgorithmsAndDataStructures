package arrays;



import logging.ArrayLogger;
import testdata.TestDataGenerator;

public class ArrayListTester {

	public static void main(String[] args) {
		
		//ArrayList array = new ArrayList();
		TestDataGenerator generator = new TestDataGenerator();
		int[] testarray = generator.generateRandomNumbers(10, 50);
		
		ArrayLogger.log(testarray);
		
		System.out.println(testarray.length);
		
		//ArrayList myarray = new ArrayList<>();
		
		
		

	}

}
