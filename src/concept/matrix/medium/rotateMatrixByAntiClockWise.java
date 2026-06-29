package concept.matrix.medium;

import java.util.Scanner;

public class rotateMatrixByAntiClockWise {
    static void print(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length-1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    static void rotateMatrixAntiClockWise(int[][] matrix) {
        reverse(matrix);
        transpose(matrix);
    }

    static void main(String[] args) {
        System.out.println("rotate matrix anti clock wise");
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
            }
        }
        rotateMatrixAntiClockWise(arr);
        print(arr);
        sc.close();
    }
}
