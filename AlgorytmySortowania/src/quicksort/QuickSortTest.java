package quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
		
		int list[] = new int[16];  
		list[0] = 52;
		list[1] = 82;
		list[2] = 4;
		list[3] = 37;
		list[4] = -150;
		list[5] = -20;
		list[6] = 14;
		list[7] = 60;
		list[8] = 13;
		list[9] = 35;
		list[10] = -42;
		list[11] = 8;
		list[12] = -1;
		list[13] = 24;
		list[14] = 10;
		list[15] = -2;
		
		//Prints list before sorting.
		System.out.print("List before sorting: ");
		for(int i =0;i<list.length;i++) {	
			System.out.print(list[i] + " ");
		}
		System.out.println("");
		
		
		
		//Prints list after sorting.
		System.out.print("Sorted list: ");
		for (int i=0; i <list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("");

	}

}
