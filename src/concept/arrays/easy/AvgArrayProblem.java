/**
 * Question name: Avg sum of Array Problem
 * Question link:
 */

package concept.arrays.easy;
import java.util.Scanner;

public class AvgArrayProblem {
    static int avgOfArray(int[] arr) {
        int res = 0;
        for (int val : arr) {
            res += val;
        }
        return res / arr.length;
    }

    static void main(String[] args) {
        System.out.println("Avg sum of Array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        System.out.println("avg sum of Array is " + avgOfArray(crr));
        sc.close();
    }
}
