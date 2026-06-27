package concept.arrays.easy;

import java.util.Scanner;

public class printArrayProblem {
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("Print Array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        print(crr);
        sc.close();
    }
}
