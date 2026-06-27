/**
 * Question Name: smallest digit in a number
 */
package concept.basicMaths.easy;

import java.util.Scanner;

public class smallestDigitProblem {
    static int smallestDigit(int n) {
        if (n < 10) return n;
        int res = Integer.MAX_VALUE;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit < res) res = lastDigit;
            n /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Smallest Digit Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The smallest digit in " + num + " is " + smallestDigit(num));
        sc.close();
    }
}
