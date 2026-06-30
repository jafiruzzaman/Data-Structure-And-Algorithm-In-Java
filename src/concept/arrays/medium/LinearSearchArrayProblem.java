/**
 * Question Name: linear search problem
 * Question link: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
 */
package concept.arrays.medium;

import java.util.Scanner;

public class LinearSearchArrayProblem {

    static int linearSearch(int[] arr, int target) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return res = i;
            }
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("linear Search problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target element you want to find");
            int target = sc.nextInt();
            System.out.println(target + " element exist at " + linearSearch(arr, target) + "th index");
            sc.close();
        }
    }
}
