/**
 * Question Name: Reverse Number
 * Question link: https://www.geeksforgeeks.org/problems/reverse-digit0316/1
 */
package concept.basicMaths.easy;

import java.util.Scanner;

public class reverseNumberProblem {

    static int reverseNumber(int num) {
        if (num < 10) {
            return num;
        }
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Reverse Number Problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int res = reverseNumber(num);
            System.out.println("After reversing the number: " + res);
            sc.close();
        }
    }
}
