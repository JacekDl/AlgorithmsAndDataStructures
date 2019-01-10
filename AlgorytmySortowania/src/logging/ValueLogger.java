package logging;

public class ValueLogger {

	public static void logValue(int number) {				//static method does not require creating of new object reference
		System.out.println("Searched value: " + number);
	}
}
