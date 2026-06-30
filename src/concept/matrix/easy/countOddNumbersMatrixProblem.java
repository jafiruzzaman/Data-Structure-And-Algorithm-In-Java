package concept.matrix.easy;

import java.util.Scanner;

public class countOddNumbersMatrixProblem {
    static int countOddNumbers(int[][] matrix) {
        int count = 0;
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println("count even number in matrix problem");
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
                    ;
                }
            }
            System.out.println("Total Even Numbers in this matrix is " + countOddNumbers(arr));
        }
    }
}
