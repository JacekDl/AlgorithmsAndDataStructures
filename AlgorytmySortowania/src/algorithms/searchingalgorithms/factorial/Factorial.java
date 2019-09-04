package algorithms.searchingalgorithms.factorial;

public class Factorial { 
	
	public static long obliczenia (long n){
		if (n == 0) {
			return 1;
		}else{
			return n * obliczenia(n-1);
		}
	}
	
	public static int obliczenia (int n){
		if (n == 0) {
			return 1;
		}else{
			return n * obliczenia(n-1);
		}
	}
}

