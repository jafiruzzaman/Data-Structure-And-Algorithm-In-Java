/**
 * Question Name: find the largest element in an array problem
 * Question link:
 */

package concept.arrays.easy;
import java.util.Scanner;

public class largestElementInAnArrayProblem {
    static int findLargest(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > res) res = value;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("largest element in an Array Problem");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] crr = new int[size];
            for (int i = 0; i < crr.length; i++) {
                crr[i] = sc.nextInt();
            }
            System.out.println("largest element in this array is " + findLargest(crr));
            sc.close();
        }
    }
}
