package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 17;
		boolean a = false;
		
		for (int i=2; i<=number-1; i++) {
			if (number % i ==0) {
				a = false;
				break;
			} else {
				a = true;
			}
		}
		
		if (a) {
			System.out.println("asaldir");
		} else {
			System.out.println("asal degildir");
		}
		

	}

}
