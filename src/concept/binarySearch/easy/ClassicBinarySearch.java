/**
 * Question Name: classic binary search
 * Question link: https://leetcode.com/problems/binary-search/description/
 */

package concept.binarySearch.easy;

import java.util.Scanner;

public class ClassicBinarySearch {
    static int binarySearch(int[] arr, int target) {
        if (arr.length < 2 && arr[0] == target) return 0;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1; // move pointer
            else end = mid - 1; // move pointer
        }
        return -1;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("classic binary search");
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
            int res = binarySearch(crr, target);
            System.out.println(target + " element exist in " + res + "th index");
            print(crr);
        }
    }
}
