/**
 * Question Name: reverse array problem
 */

package concept.arrays.easy;
import java.util.Scanner;

public class reverseArrayProblem {
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("reverse array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        print(arr);
        sc.close();
    }
}
