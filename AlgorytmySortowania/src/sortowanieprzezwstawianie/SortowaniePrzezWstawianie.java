package sortowanieprzezwstawianie;

public class SortowaniePrzezWstawianie {

	public static void main(String[] args) {
		int Lista[] = new int[16];  
		Lista[0] = 52;
		Lista[1] = 82;
		Lista[2] = 4;
		Lista[3] = 37;
		Lista[4] = 47;
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

		//Wy�wietla originaln� list� - przed posortowaniem.
		System.out.print("Originalna lista: ");
		for(int i =0;i<Lista.length;i++) {	
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");

		//Sortowanie przez wstawianie.
		
		for(int i = 1;i<Lista.length;i++) {
			int klucz = Lista[i];
			int j = i - 1;
			while(j>-1 && Lista[j]>klucz) {
				Lista[j+1]=Lista[j];
				j--;
			}
			Lista[j+1]=klucz;
		}

		//Wy�wietla posortowan� list�.
		System.out.print("Posortowana lista: ");
		for (int i=0; i <Lista.length;i++) {
			System.out.print(Lista[i] + " ");
		}
		System.out.println("");

	}

}
