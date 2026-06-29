/**
 * Question Name: bubble-sort
 * Question link: https://www.geeksforgeeks.org/problems/bubble-sort/1
 */

package concept.sorting.easy;

import java.util.Scanner;

public class bubbleSortAlgorithm {
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swap = true;
            }
            if (!swap) break;
        }
    }

    static void main(String[] args) {
        System.out.println("Learn Bubble sort Algorithm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        print(arr);
        sc.close();
    }
}
