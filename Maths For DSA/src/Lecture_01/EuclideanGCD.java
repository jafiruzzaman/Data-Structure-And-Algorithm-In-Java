package Lecture_01;
import java.util.Scanner;

/*
	GFG Link --> https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

	Logic:
	1. Run loop until b != 0.
	2. store the value of b
	3. update b's remainder
	4. update a with temp value
*/

public class EuclideanGCD {
	static int gcdIterative(int a, int b){
		while (b!=0){
			int temp =b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		sc.close();

		int result = gcdIterative(a, b);
		System.out.println("GCD of " + a + " and " + b + " is: " + result);
	}
}
