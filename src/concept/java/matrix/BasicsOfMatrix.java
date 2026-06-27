package concept.java.matrix;

public class BasicsOfMatrix {
    static void main(String[] args) {
        System.out.println("Basics of Matrix or 2D Array");
        /**
         * Matrix/2D Array: Matrix or 2D Array is collection of multiple 1D array
         */

        // declare a matrix
        int[][] matrix;

        // initialize a matrix
        matrix = new int[3][3];
        // insert elements

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // print matrix
        for (int[] element : matrix) {
            for (int value : element) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
