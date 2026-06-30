package concept.matrix.easy;

import java.util.Scanner;

public class largestRowSumMatrixProblem {
    static int largestRowSum(int[][] matrix) {
        int res = Integer.MIN_VALUE;
        for (int[] matrix1 : matrix) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix1[j];
            }
            if (sum > res) res = sum;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("largest row sum in a matrix");
        try (Scanner sc = new Scanner(System.in)) {
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
                }
            }
            System.out.println("largest row sum is " + largestRowSum(arr));
        }
    }
}
