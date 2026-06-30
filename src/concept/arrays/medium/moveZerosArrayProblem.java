/**
 * Question Name: move zeros to the end
 * Question link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
 */
package concept.arrays.medium;


import java.util.Scanner;

public class moveZerosArrayProblem {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void moveZeros(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("Move zeros to the end");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            moveZeros(arr);
            print(arr);
        }
    }
}
