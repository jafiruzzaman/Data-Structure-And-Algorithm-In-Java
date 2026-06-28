package concept.matrix.easy;

import java.util.Scanner;

public class largestColSumMatrixProblem {
    static int largestColSum(int[][] matrix) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > res) res = sum;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println("largest col sum of matrix");
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
        System.out.println("largest col sum is " + largestColSum(arr));
        sc.close();
    }
}
