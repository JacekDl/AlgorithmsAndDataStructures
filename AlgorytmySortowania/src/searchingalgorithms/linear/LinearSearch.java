package linear;

public class LinearSearch {

	public static void main(String[] args) {
		
		int Lista[] = new int[11];
		Lista[0] = 15;
		Lista[1] = 23;
		Lista[2] = 9;
		Lista[3] = 125;
		Lista[4] = 18;
		Lista[5] = 56;
		Lista[6] = 2;
		Lista[7] = 24;
		Lista[8] = 35;
		Lista[9] = 24;
		Lista[10] = 17;
		
		int value = 24;
		int answer = -1;
		
		//Searches array. Finds last value from array.
		for (int i=0; i<Lista.length; i++) {
			if (Lista[i] == value) {
				answer = i;
			}
		}
		
		if (answer >= 0) {
			System.out.print("Searched value position number:  " + answer);
		}else {
			System.out.print("Searched value is not on the list.");
		}
		
	}

}
