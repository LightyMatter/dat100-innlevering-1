package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int F = 39;
		int E = 49;
		int D = 59;
		int C = 79;
		int B = 89;
		int A = 100;

		for (int i = 0; i < 10; i++) {

			System.out.println("Skriv inn poengsum: ");
			int poengsum = Integer.parseInt(input.nextLine());

			if (poengsum <= F && poengsum >= 0) {
				System.out.println("F");
			} else if (poengsum <= E && poengsum > F) {
				System.out.println("E");
			} else if (poengsum <= D && poengsum > E) {
				System.out.println("D");
			} else if (poengsum <= C && poengsum > D) {
				System.out.println("C");
			} else if (poengsum <= B && poengsum > C) {
				System.out.println("B");
			} else if (poengsum <= A && poengsum > B) {
				System.out.println("A");
			} else {
				System.out.println("Ugyldig poengsum, prøv på nytt.");
				i--;
			}
		}

		input.close();
	}
}

