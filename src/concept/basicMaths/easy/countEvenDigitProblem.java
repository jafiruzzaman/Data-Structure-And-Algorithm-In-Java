package concept.basicMaths.easy;

import java.util.Scanner;

public class countEvenDigitProblem {
    static int countEvenDigit(int n) {
        if (n == 0) return 1;
        int res = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) res++;
            n /= 10;
        }
        return res;
    }
    static void main(String[] args) {
        System.out.println("Count even digits in a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Even Digit in the Number is " + countEvenDigit(num));
        sc.close();
    }
}
