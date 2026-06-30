/**
 * Question Name: Count Digits
 * Question link: https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1
 */
package concept.basicMaths.easy;

import java.util.Scanner;

public class countDigits {
    static int countDigit(int num) {
        if (num < 10) return 1;
        int res = 0;
        while (num > 0) {
            res++;
            num /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("count digit problem");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int res = countDigit(num);
            System.out.println("total digit are " + res);
            sc.close();
        }
    }
}
