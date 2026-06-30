/**
 * Question Name: second-smallest element in an array problem
 * Question link:
 */
package concept.arrays.easy;

import java.util.Scanner;

public class secondSmallestElementInAnArrayProblem {

    static int find2ndSmallestElement(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return -1;
        }
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value > smallest && value < secondSmallest) {
                secondSmallest = value;
            }
        }
        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    static void main(String[] args) {
        System.out.println("Find the 2nd smallest element in an array Problem");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] crr = new int[size];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < crr.length; i++) {
                crr[i] = sc.nextInt();
            }
            System.out.println("2nd smallest element in this array is " + find2ndSmallestElement(crr));
            sc.close();
        }
    }
}
