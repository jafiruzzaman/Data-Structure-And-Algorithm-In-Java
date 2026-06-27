/**
 * Question Name: find the 2nd largest element in an array Problem
 * Question link:
 */
package concept.arrays.easy;
import java.util.Scanner;

public class secondLargestElementInAnArrayProblem {
    static int find2ndLargestElement(int[] arr) {
        int len = arr.length;
        if (len < 2) return -1;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value < largest && value > secondLargest) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }

    static void main(String[] args) {
        System.out.println("Find the 2nd largest element in an array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        System.out.println("2nd largest element in this array is " + find2ndLargestElement(crr));
        sc.close();
    }
}
