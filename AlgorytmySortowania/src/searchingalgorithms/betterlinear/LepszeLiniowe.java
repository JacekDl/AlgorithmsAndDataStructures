package betterlinear;

public class LepszeLiniowe {

	public static void main(String[] args) {
		int Lista[] = new int[11];
		Lista[0] = 15;
		Lista[1] = 23;
		Lista[2] = 24;
		Lista[3] = 125;
		Lista[4] = 18;
		Lista[5] = 56;
		Lista[6] = 2;
		Lista[7] = 24;
		Lista[8] = 35;
		Lista[9] = 24;
		Lista[10] = 17;
		
		int wyszukiwanaWartosc = 17;
		int odpowiedz = -1;
		
		//Wyszukuje pierwsz¹ wyszukiwan¹Wartosc znajduj¹c¹ siê na liœcie.
		//Zaprzestaje przeszukiwania ca³ej listy jeœli wyszukiwanaWartosc zostanie odnaleziona(funkcja break).
		for (int i=0; i<Lista.length; i++) {
			if (Lista[i] == wyszukiwanaWartosc) {
				odpowiedz = i;
				break;
			}
		}
		
		if (odpowiedz >= 0) {
			System.out.print("Wyszukiwana wartosc znajduje sie pod indeksem nr: " + odpowiedz);
		}else {
			System.out.print("Wyszukiwana wartosc nie znajduje sie na liscie.");
		}

	}

}
