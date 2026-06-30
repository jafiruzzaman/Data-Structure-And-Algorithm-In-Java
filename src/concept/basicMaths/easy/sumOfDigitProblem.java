/**
 * Question Name: Sum of Digit Problem
 * Question link: https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
 */

package concept.basicMaths.easy;

import java.util.Scanner;

public class sumOfDigitProblem {
    static int sumOfDigit(int n) {
        if (n < 10) return n;
        int res = 0;
        while (n > 0) {
            res = res + (n % 10);
            n /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("sum of digits problem");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println("Sum of " + num + " digits is: " + sumOfDigit(num));
            sc.close();
        }
    }
}
