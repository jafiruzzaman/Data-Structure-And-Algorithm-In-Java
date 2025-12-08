package basics;

import java.util.Scanner;
/*
	GFG link --> https://www.geeksforgeeks.org/problems/count-digits-1606889545/1
*/
public class countDigits {
	static int countDigit(int n){
		// base-case
		if(n==0) return 0;
		// recursive relation
		return 1+ countDigit(n/10);

	}
	static void main(String[] args) {
		System.out.println("Count Digits Problem using Recursion");
		System.out.print("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result = countDigit(n);
		System.out.println(result);
		sc.close();
	}
}
