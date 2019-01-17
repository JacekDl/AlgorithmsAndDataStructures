package linearrecursion;

public class LinioweRekurencja {

	public static void main(String[] args) {
		//Lista wartoœci.
		int list[] = {1,34,67,12,14,17,90,-123,45,25,67,77}; 	
		//Wartoœæ szukana.
		int wartoscSzukana = 0;									

		//Wyœwietla listê i wartoœæ szukan¹.
		System.out.print("Lista: ");					
		for(int i = 0 ; i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("Wartoœæ szukana: " + wartoscSzukana);
		
		//Wywo³uje metodê liniowe klasy Wyszukiwanie z argumentami list i wartoscSzukana.
		Wyszukiwanie.liniowe(list,wartoscSzukana);
	}
}
