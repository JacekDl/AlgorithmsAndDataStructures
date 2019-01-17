package linearrecursion;

public class Wyszukiwanie {

	//Wyswietla komunikat o niepowodzeniu lub sukcesie przeszukiwania listy, 
	//na podstawie wyniku metody wyszukLiniowe.
	static void liniowe(int list[],int wartoscSzukana) {
		if (wyszukLiniowe(list, list.length-1, 0, wartoscSzukana) == -1){
			System.out.print("Nie znaleziono szukanej wartoœci.");
		}else{
			System.out.print("Szukana wartoœæ znajduje siê pod indeksem nr: " + wyszukLiniowe(list, list.length, 0, wartoscSzukana));
		};
	}

	private static int wyszukLiniowe(int list[], int n, int i, int wartoscSzukana){
		if (i > n) {
			return -1;
		}else if(i <= n && list[i] == wartoscSzukana) {
			return i;
		}else{
			return wyszukLiniowe(list, n, i+1, wartoscSzukana);
		}
	}
}

