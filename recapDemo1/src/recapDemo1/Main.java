package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 5;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int maxNumber = sayi1;
		
		if (maxNumber < sayi2) {
			maxNumber = sayi2;
		}
		
		if (maxNumber < sayi3) {
			maxNumber = sayi3;
		}
		
		
		System.out.println(maxNumber);

	}

}
