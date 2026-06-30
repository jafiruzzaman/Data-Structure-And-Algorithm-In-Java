/**
 * Question Name: Print matrix
 * Question link:
 */
package concept.matrix.easy;
import java.util.Scanner;

    public class printMatrixProblem {
        static void printMatrix(int[][] matrix) {
            for (int[] matrix1 : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix1[j] + " ");
                }
                System.out.println();
            }
        }

        static void main(String[] args) {
            System.out.println("Print Matrix Problem");
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
                System.out.println("Printing matrix");
                printMatrix(arr);
            }
        }
    }
