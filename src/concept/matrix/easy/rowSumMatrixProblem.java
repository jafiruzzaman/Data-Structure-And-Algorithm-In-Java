package concept.matrix.easy;

import java.util.Scanner;

public class rowSumMatrixProblem {
    static int[] rowWiseSum(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            res[i] = sum;
            sum = 0;
        }
        return res;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        System.out.println("row sum Matrix Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int row = sc.nextInt();
        System.out.println("Enter the size of the col");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements for " + i + "th row ");
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                ;
            }
        }
        int[] res = rowWiseSum(arr);
        print(res);
        sc.close();
    }
}
