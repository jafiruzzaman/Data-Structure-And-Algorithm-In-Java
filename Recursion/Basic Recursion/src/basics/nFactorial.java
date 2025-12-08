package basics;

import java.util.Scanner;

public class nFactorial {

	static int nFactorials(int n) {
		// Base Case
		if (n == 0 || n == 1) return 1;

		// Recursive Relation
		return n * nFactorials(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Factorial of a Number");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Handle negative input
		if (n < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			return;
		}

		int result = nFactorials(n);
		System.out.println("The factorial of " + n + " is " + result);
		sc.close();
	}
}
