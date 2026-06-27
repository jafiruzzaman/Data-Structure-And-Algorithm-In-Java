package concept.arrays.easy;

import java.util.Scanner;

public class countOddNumberInAnArrayProblem {
    static int countOddNumber(int[] arr) {
        int res = 0;
        for (int j : arr) {
            if (j % 2 != 0) res++;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Count Odd ");
        System.out.println("Count even numbers in an array problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        System.out.println("Odd numbers in this array is " + countOddNumber(crr));
        sc.close();
    }
}
