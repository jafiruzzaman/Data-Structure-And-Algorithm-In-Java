/**
 * Question Name: right rotate an array by one places problem
 * Question link:
 */
package concept.arrays.medium;

import java.util.Scanner;

public class rightRotateAnArrayByOnePlacesProblem {
    static void rightRotateByOnePlaces(int[] arr) {
        int startVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = startVal;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("right rotate an array by one places problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            rightRotateByOnePlaces(arr);
            print(arr);
        }
    }
}
