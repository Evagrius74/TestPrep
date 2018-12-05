package library;

import java.util.Arrays;

public class compareMatrix {

    public static void main(String[] args) {

//        int[][] matrix1 = {{2, 1}, {0, 1}};
//        int[][] matrix2 = {{0, 3}, {-1, 1}};
//        int[][] result = composeMatrix(matrix1, matrix2);

        int[][] matrix1 = {{-1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] matrix2 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] result = composeMatrix(matrix1, matrix2);// {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] expected = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        Boolean x = Arrays.equals(result, expected);

        System.out.println("\nInput1: ");
        printMatrix(matrix1);

        System.out.println("\nInput2: ");
        printMatrix(matrix2);

        System.out.println("\nresult: ");
        printMatrix(result);

        System.out.println(x);
        System.out.println(result.toString());
        System.out.println(expected.toString());

    }

    public static int[][] composeMatrix(int[][] input1, int[][] input2) {

        int size = input1[0].length;
        int[][] result = new int[size][size];

        for (int i=0; i<size;i++) {
            for (int j=0; j<size;j++) {
                if (input1[i][j] >= input2[i][j]) {
                    result[i][j] = input1[i][j];
                }
                else {
                    result[i][j] = input2[i][j];
                }
            }

        }
        return result;
    }

    public static void printMatrix(int[][] input) {

        int size = input[0].length;

        for (int i=0; i<size;i++) {
            for (int j=0; j<size;j++) {
                System.out.print(input[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
