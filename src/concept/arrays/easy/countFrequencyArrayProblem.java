/**
 * Question Name: count the number of frequency in an array problem
 * Question link:
 */
package concept.arrays.easy;

import java.util.Scanner;

public class countFrequencyArrayProblem {
    static int countFrequency(int[] arr, int num) {
        int res = 0;
        for (int value : arr) {
            if (value == num) res++;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("count the number of frequency in an array problem");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the target element: ");
            int num = sc.nextInt();
            System.out.println(num + " appears " + countFrequency(arr, num) + " times in this array");
            sc.close();
        }
    }
}
