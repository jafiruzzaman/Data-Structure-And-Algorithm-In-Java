package concept.arrays.easy;

import java.util.Scanner;

public class copyingArrayProblem {
    static int[] copyingArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int idx = 0;
        for (int value : arr) {
            newArr[idx] = value;
            idx++;
        }
        return newArr;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("Coping an Array Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] crr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();
        }
        int[] res = copyingArray(crr);
        System.out.println("After coping new array");
        print(res);
        sc.close();
    }
}
