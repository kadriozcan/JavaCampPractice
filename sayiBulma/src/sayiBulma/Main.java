package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0, 5, 5};
		int aranacak = 12;
		int sayac = 0;
		boolean b = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				sayac += 1;
				b = true;
			}
		}

		if (b) {
			System.out.println(sayac + " tane var");
		} else {
			System.out.println("bulunmuyor");
		}

	}

}
