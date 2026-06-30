/**
 * Question Name: Check if array is sorted or not
 * Question link:
 */
package concept.arrays.easy;

import java.util.Scanner;

public class isArraySortedArrayProblem {

    static boolean checkIfArrayIsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        System.out.println("Check if array is sorted or not Problem");
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            boolean res = checkIfArrayIsSorted(arr);
            System.out.println("is the array is sorted " + res);
            sc.close();
        }
    }
}
