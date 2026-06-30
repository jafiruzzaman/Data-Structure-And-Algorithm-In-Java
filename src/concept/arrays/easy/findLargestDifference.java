/**
 * Question Name: find the largest difference in an array problem
 * Question link: https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 */

package concept.arrays.easy;

import java.util.Scanner;

public class findLargestDifference {
    static int largestDifference(int[] arr) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int diff = arr[j] - arr[i];
                    if (diff > res) res = diff;
                }
            }
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("Find the largest difference in an array problem");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("largest difference is " + largestDifference(arr));
        }
    }
}
