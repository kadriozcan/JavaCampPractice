package javaEndOfFile;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int n = 0;
        
        while (scanner.hasNext()) {
            System.out.println(++n + " " + scanner.nextLine());
        }
        scanner.close();

	}

}
