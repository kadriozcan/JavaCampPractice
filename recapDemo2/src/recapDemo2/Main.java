package recapDemo2;

public class Main {

	
	public static void main(String[] args) {
		
		double[] myList = {1.2, 1.3, 4.3, 5.6};
		double total = 0;
		double max = 0;
		for (double myNumber: myList) {
			if (myNumber>max) {
				max = myNumber;
			}
			total = myNumber + total;
		}
		System.out.println(total);
		System.out.println(max);

	}

}
