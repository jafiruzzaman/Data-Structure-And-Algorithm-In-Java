/**
 * Question Name: find first & last Occurrence
 * Question link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
package concept.binarySearch.easy;

import java.util.Scanner;

public class searchFirstAndLastOccurrence {

    public static int findFirstOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int findLastOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);
        return new int[]{first, last};
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("find the first & last occurrence ");
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
            int[] res = searchRange(crr, target);
            System.out.println(target + " element 1st Occurrence exist in " + res[0] + "th index & last element exist in " + res[1] + "th index");
            print(crr);
        }
    }
}
