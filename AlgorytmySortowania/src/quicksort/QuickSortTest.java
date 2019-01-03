package quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
		
		int Lista[] = new int[16];  
		Lista[0] = 52;
		Lista[1] = 82;
		Lista[2] = 4;
		Lista[3] = 37;
		Lista[4] = -150;
		Lista[5] = -20;
		Lista[6] = 14;
		Lista[7] = 60;
		Lista[8] = 13;
		Lista[9] = 35;
		Lista[10] = -42;
		Lista[11] = 8;
		Lista[12] = -1;
		Lista[13] = 24;
		Lista[14] = 10;
		Lista[15] = -2;
		
		//Wyœwietla originaln¹ listê - przed posortowaniem.
		System.out.print("Originalna lista: ");
		for(int i =0;i<Lista.length;i++) {	
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");
		
		
		
		//Wyœwietla posortowan¹ listê.
		System.out.print("Posortowana lista: ");
		for (int i=0; i <Lista.length;i++) {
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");

	}

}
