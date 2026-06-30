/**
 * Question Name: selection sort
 * Question link: https://www.geeksforgeeks.org/problems/selection-sort/1
 */
package concept.sorting.easy;

import java.util.Scanner;

public class selectionSortAlgorithm {

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            // find the minimum
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // now swap values
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void main(String[] args) {
        System.out.println("selection sort algorithm");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            selectionSort(arr);
            print(arr);
        }
    }
}
