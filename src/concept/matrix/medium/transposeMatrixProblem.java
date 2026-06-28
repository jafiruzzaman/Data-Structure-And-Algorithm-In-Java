/**
 * Question Name: transpose matrix
 * Question link:
 */

package concept.matrix.medium;
import java.util.Scanner;

public class transposeMatrixProblem {
    static void print(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row < col) {
                    int temp = matrix[col][row];
                    matrix[col][row] = matrix[row][col];
                    matrix[row][col] = temp;
                }
            }
        }
    }

    static void main(String[] args) {
        System.out.println("Transpose matrix problem");
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
        transposeMatrix(arr);
        print(arr);
        sc.close();
    }
}
