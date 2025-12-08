package Lecture_01;

import java.util.Scanner;

/*
LeetCode Link --> https://leetcode.com/problems/palindrome-number/description/

Logic:
	0. Check for edge-case (negative numbers are not palindrome)
	1. Store the number in a variable to compare after reversing
	2. Reverse the number
	3. Compare numbers and return
*/
class PalindromeNumber {

	// Function to check palindrome
	static boolean isPalindrome(int x) {
		if (x < 0) return false; // Edge case

		int originalNumber = x;
		int reverseNumber = 0;

		while (x > 0) {
			int lastDigit = x % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			x /= 10;
		}

		return originalNumber == reverseNumber;
	}

	// Correct main method signature
	static void main(String[] args) {
		System.out.println("Check Palindrome Number");
		System.out.print("Enter Number to Check Palindrome: ");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		boolean result = isPalindrome(number);
		System.out.println("Is the number a Palindrome? " + result);

		sc.close();
	}
}
