/**
 * Question Name: find first occurrence in sorted array
 * Question link: https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
 */

package concept.binarySearch.easy;

import java.util.Scanner;

public class firstOccurrenceBinarySearch {

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("find the first Occurrence");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] crr = new int[size];
            System.out.println("Enter array elements");
            for (int i = 0; i < crr.length; i++) {
                crr[i] = sc.nextInt();
            }
            System.out.println("Enter the target element");
            int target = sc.nextInt();
            int res = findFirstOccurrence(crr, target);
            System.out.println(target + " element exist in " + res + "th index");
            print(crr);
        }
    }
}
