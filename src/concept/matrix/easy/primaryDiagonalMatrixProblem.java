package concept.matrix.easy;

import java.util.Scanner;

public class primaryDiagonalMatrixProblem {
    static void printPrimaryDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
                break;
            }
        }
    }

    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    static void main(String[] args) {
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
                    ;
                }
            }
            printPrimaryDiagonal(arr);
            print(arr);
        }
    }
}
