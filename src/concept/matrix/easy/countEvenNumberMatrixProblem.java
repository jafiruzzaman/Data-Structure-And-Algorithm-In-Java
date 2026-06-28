package concept.matrix.easy;

import java.util.Scanner;

public class countEvenNumberMatrixProblem {
    static int countEvenNumbers(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println("count even number in matrix problem");
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Total Even Numbers in this matrix is " + countEvenNumbers(arr));
        sc.close();
    }
}
