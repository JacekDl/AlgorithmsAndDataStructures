package insertionsort;

import java.util.List;

import logging.ArrayLogger;
import testdata.TestDataGenerator;

//TODO please rename polish -> english 
public class SortowaniePrzezWstawianie {

	public void sortByInsertion(int[] list) {
		
		for(int i = 1;i<list.length;i++) {
			int klucz = list[i];
			int j = i - 1;
			while(j>-1 && list[j]>klucz) {
				list[j+1]=list[j];
				j--;
			}
			list[j+1]=klucz;
		}
	}
	
	// example - short, meaningful methods
	private void doSmth(List<Integer> list) {
		
		if(isEmpty(list)) {
			//do smth
		}

	}
	
	private static boolean isEmpty(List<Integer> list) {
		return list == null || list.size() == 0;
	}	
	
	public static void main(String[] args) {
		
		SortowaniePrzezWstawianie sorting = new SortowaniePrzezWstawianie();
		
		TestDataGenerator generator = new TestDataGenerator();
		generator.generateRandomNumbers(16, 100);
		
		int list[] = generator.generateRandomNumbers(16, 100);
		

		//Wyœwietla originaln¹ listê - przed posortowaniem.
		System.out.print("Originalna lista: ");
		ArrayLogger.log(list);
	
		//Sortowanie przez wstawianie.
		sorting.sortByInsertion(null);

		//Wyœwietla posortowan¹ listê.
		System.out.print("Posortowana lista: ");
		ArrayLogger.log(list);

	}

}
