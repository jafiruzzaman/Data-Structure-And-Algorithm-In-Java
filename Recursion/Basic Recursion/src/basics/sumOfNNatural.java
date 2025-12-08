package basics;

import java.util.Scanner;
/*
	* GFG link --> https://www.geeksforgeeks.org/problems/sum-of-series2811/1
*/
public class sumOfNNatural {
	static int totalSumOfNNatural(int n){
		// base-case
		if (n==1) return 1;
		// recursive-relation
		return n+totalSumOfNNatural(n-1);
	}
	static void main() {
		System.out.println("calculate Sum of N Natural Number");
		System.out.print("Enter the number for N natural Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result  = totalSumOfNNatural(n);
		System.out.println("The Sum of N Natural Number is : "+result);
		sc.close();
	}
}
