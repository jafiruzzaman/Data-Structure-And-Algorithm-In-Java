/**
 * Question Name: secondary diagonal matrix
 */
package concept.matrix.easy;
import java.util.Scanner;

public class secondaryDiagonalMatrixProblem {
    static void secondaryDiagonal(int[][] matrix) {
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                if (j + i == matrix.length - 1) {
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }

    static void main(String[] args) {
        System.out.println("secondary diagonal Pattern Printing");
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
        secondaryDiagonal(arr);
        sc.close();
    }
}
