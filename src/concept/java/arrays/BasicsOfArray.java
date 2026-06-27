package concept.java.arrays;

import java.util.Scanner;

public class BasicsOfArray {
    static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");

        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("learn about array concept");
        /**
         * Array: Array is a collection of similar elements in contagious way
         */
        // how to create an array (declare)
        int[] arr;
        // initialize
        arr = new int[5];
        // insert value in the array
        arr[0] = 50; // NOTE: by arrays default value is 0
        // insert value in the array
        arr[4] = 51;
        arr[3] = 37;
        // access array elements
        System.out.println(arr[1]); // default value is null

        // declare & initialize a variable
        int[] brr = {1, 2, 4, 5, 6, 3, 5};
        System.out.println(brr); // NOTE: if i print the array it will give me Memory-Address: [I@27716f4
        // traverse array using for & foreach loop
        System.out.println("traverse using traditional for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("print using for-each loop");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        // how to take input in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        print(crr);

        // make sure to close
        sc.close();
    }
}
