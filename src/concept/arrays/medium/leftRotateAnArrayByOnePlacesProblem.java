/**
 * Question Name: Left rotate an array by one places problem
 * Question link: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
 */
package concept.arrays.medium;

import java.util.Scanner;

public class leftRotateAnArrayByOnePlacesProblem {
    static void leftRotateByOnePlaces(int[] arr) {
        int lastVal = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastVal;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("Left rotate an array by one places problem");

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            leftRotateByOnePlaces(arr);
            print(arr);
            sc.close();
        }
    }
}
