package linearrecursion;

public class LinioweRekurencja {

	public static void main(String[] args) {
		//Lista warto�ci.
		int list[] = {1,34,67,12,14,17,90,-123,45,25,67,77}; 	
		//Warto�� szukana.
		int wartoscSzukana = 0;									

		//Wy�wietla list� i warto�� szukan�.
		System.out.print("Lista: ");					
		for(int i = 0 ; i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("Warto�� szukana: " + wartoscSzukana);
		
		//Wywo�uje metod� liniowe klasy Wyszukiwanie z argumentami list i wartoscSzukana.
		Wyszukiwanie.liniowe(list,wartoscSzukana);
	}
}
