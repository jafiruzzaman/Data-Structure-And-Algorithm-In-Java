package concept.matrix.easy;

import java.util.Scanner;

public class snakePatternPrintingRowWise {
    static void snakePatternRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        System.out.println("printing matrix with snake pattern row wise");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the row");
            int row = sc.nextInt();
            System.out.println("Enter the size of the col");
            int col = sc.nextInt();
            int[][] arr = new int[row][col];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter elements for " + i + "th row ");
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            snakePatternRowWise(arr);
        }
    }
}
