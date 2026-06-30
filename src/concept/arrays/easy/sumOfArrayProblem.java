package concept.arrays.easy;

import java.util.Scanner;

public class sumOfArrayProblem {

    static int sumOfArray(int[] arr) {
        int res = 0;
        for (int val : arr) {
            res += val;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Sum of Array Problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] crr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < crr.length; i++) {
                crr[i] = sc.nextInt();
            }
            System.out.println("Sum of Array is " + sumOfArray(crr));
            sc.close();
        }
    }
}
