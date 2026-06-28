package concept.matrix.medium;

import java.util.Scanner;

public class boundaryTraversalMatrixProblem {

    static void boundaryTraversal(int[][] matrix) {
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        for (int i = left; i <= right; i++) {
            System.out.print(matrix[top][i] + " ");
        }

        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }

        for (int i = right - 1; i >= left; i--) {
            System.out.print(matrix[bottom][i] + " ");
        }

        for (int i = bottom - 1; i > top; i--) {
            System.out.print(matrix[i][left] + " ");
        }
    }

    static void main(String[] args) {
        System.out.println("Boundary Traversal Problem");
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
        boundaryTraversal(arr);
        sc.close();
    }
}
