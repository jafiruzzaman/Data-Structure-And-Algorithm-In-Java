package Lecture_01;

import java.util.Scanner;

/*
	GFG Link --> https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
	Example: n = 153 is an Armstrong number since 1^3+5^3+3^3 = 153
	Logic:
	0. check edge-case
	1. I will extract the digit
	2. multiply 3 times with each number
	3. store the sum into a variable
	4. compare with original number
	5. return true or false
*/
public class ArmstrongNumber {
	static boolean armstrongNumberSolution(int x){
		// edge-case
		if(x==0 || x ==1 ) return true;
		int originalNumber = x;
		int armstrong = 0;
		while(x>0){
			int lastDigit = x%10;
			armstrong = armstrong + lastDigit*lastDigit*lastDigit;
			x/=10;
		}
		return originalNumber == armstrong;
	}
	static void main() {
		System.out.println("Armstrong Number Problem");
		System.out.print("Check Number if it is Armstrong Or Not : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean result = armstrongNumberSolution(number);
		System.out.println("Is "+number+" is an Armstrong number : "+result);
		sc.close();
	}
}
