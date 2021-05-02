package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int a = 220;
		int b = 284;
		int totalA = 0;
		int totalB = 0;
		
		for (int i=1; i<a; i++) {
			if (a % i == 0) {
				totalA = totalA + i;
			}
		}
		
		for (int j=1; j<b; j++) {
			if (b % j == 0) {
				totalB = totalB + j;
			}
		}
		
		if (totalA == b && totalB == a) {
			System.out.println("arkadaslar");
		} else {
			System.out.println("degiller");
		}
		
		
		
		

	}

}
