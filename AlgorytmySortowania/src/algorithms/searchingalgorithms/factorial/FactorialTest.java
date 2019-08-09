package factorial;

public class FactorialTest {

	public static void main(String[] args) {

		int[] intvalue = new int[20];
		for (int i = 1; i < intvalue.length; i++) {
			intvalue[i] = i;
			System.out.println(intvalue[i] + "! = " + Factorial.obliczenia(intvalue[i]));
		}

		System.out.println("");
		
		long[] longvalue = new long[20];
		for (int i = 0; i < longvalue.length; i++) {
			longvalue[i] = i;
			System.out.println(longvalue[i] + "! = " + Factorial.obliczenia(longvalue[i]));

		}

	}
}
