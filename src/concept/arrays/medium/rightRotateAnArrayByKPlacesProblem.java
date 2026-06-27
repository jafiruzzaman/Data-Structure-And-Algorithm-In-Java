package concept.arrays.medium;

import java.util.Scanner;

public class rightRotateAnArrayByKPlacesProblem {
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rightRotateByKPlaces(int[] arr, int d) {
        d = d % arr.length;
        // first reverse 0 to d-1
        reverse(arr, 0, arr.length - 1);
        // then reverse d to n-1
        reverse(arr, 0, d - 1);
        // reverse the whole array
        reverse(arr, d, arr.length - 1);
    }

    static void main(String[] args) {
        System.out.println("Left rotate an array by one places problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("How many times you want to rotate");
        int rotate = sc.nextInt();
        rightRotateByKPlaces(arr, rotate);
        print(arr);
        sc.close();
    }
}
