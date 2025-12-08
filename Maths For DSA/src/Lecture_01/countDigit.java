package Lecture_01;

import java.util.Scanner;

/*
Problem Link --> https://www.geeksforgeeks.org/problems/count-digits-1606889545/1

Example:
    n = 456
    Output: 3
Logic:
    1. Extract the last digit using n % 10
    2. Update the number by n / 10
    3. Repeat until number > 0
*/

class CountDigit {

	// Function to count digits of a number
	static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10; // Remove the last digit
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to count its digits:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int result = countDigits(number);
		System.out.println("The number contains " + result + " digits.");

		sc.close();
	}
}
