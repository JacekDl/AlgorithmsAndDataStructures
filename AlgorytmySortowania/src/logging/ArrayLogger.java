package logging;

import java.util.List;
public class ArrayLogger {

	public static void log(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public void logArrayList(List<Integer> newArray) {
		for (Integer value : newArray) {
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
}
