package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in verdien av n: ");
		int n = input.nextInt();
		
		if (n > 0) {
			int result = 1; 
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			System.out.println(result);
		}
		input.close();
	}
}
