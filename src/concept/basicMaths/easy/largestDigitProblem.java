package concept.basicMaths.easy;

import java.util.Scanner;

public class largestDigitProblem {
    static int largestDigit(int n) {
        if (n < 10) return n;
        int res = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > res) res = lastDigit;
            n /= 10;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Largest digit in a Number Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The largest digit in " + num + " is " + largestDigit(num));
        sc.close();
    }
}
