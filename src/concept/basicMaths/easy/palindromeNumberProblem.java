/**
 * Question Name: Check if a number is palindrome or Not
 * Question link: https://www.geeksforgeeks.org/problems/palindrome0746/1
 */
package concept.basicMaths.easy;

import java.util.Scanner;

public class palindromeNumberProblem {
    static boolean isPalindrome(int num) {
        int temp = Math.abs(num);
        num = Math.abs(num);
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return temp == res;
    }

    static void main(String[] args) {
        System.out.println("Check if a number is palindrome or not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean res = isPalindrome(num);
        System.out.println("Is the number is palindrome: " + res);
        sc.close();
    }
}
