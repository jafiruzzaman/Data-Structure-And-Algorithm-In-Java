package basics;

import java.util.Scanner;

public class reverseNumber {
	static int reverseNumberRecursive(int n){
		// base-case : for single digit
		if(n<10) return n;
		// recursive relation
		int lastDigit = n%10;
		System.out.println("Last digit is "+lastDigit);
		int digits = (int) Math.log10(n);
		System.out.println("Digit is "+digits);
		return  lastDigit * (int)Math.pow(10, digits)+reverseNumberRecursive(n/10);
	}
	static void main() {
		System.out.println("Reverse Number using Recursion");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = reverseNumberRecursive(n);
		System.out.println(result);
		sc.close();
	}
}
