/**
 * Question Name: Product of Digits
 * Question link:
 */
package concept.basicMaths.easy;

import java.util.Scanner;

public class productOfDigitProblem {
    static int productOfDigit(int n) {
        if (n < 10) return n;
        int res = 1;
        while (n > 0) {
            res = res * (n % 10);
            n /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Product of digit problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println("Sum of " + num + " digits is: " + productOfDigit(num));
        }
    }
}
