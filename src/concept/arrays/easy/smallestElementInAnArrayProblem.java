package concept.arrays.easy;

import java.util.Scanner;

public class smallestElementInAnArrayProblem {
    static int findSmallest(int[] arr) {
        int res = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < res) res = value;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Find the Smallest element in an Array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        System.out.println("smallest element in this array is " + findSmallest(crr));
        sc.close();
    }
}
