import java.util.Scanner;

public class task8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        Matrix(matrix);

    }

    static void MatrOutput(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
        }
        System.out.println();
    }
    static void Matrix(int[][] matrix) {
        int k = 1;
        for (int i = 0; i < matrix.length / 2 - 1; i++) {
            matrix[i][0] = k;
            k++;
        }
        for (int i = matrix.length / 2 - 1; i > 0; i--) {
            matrix[i][matrix.length / 2 - i - 1] = k;
            k++;
        }
        for (int i = matrix.length / 2 - 1; i > 0; i--) {
            matrix[0][i] = k;
            k++;
        }
        for (int i = 0; i < matrix.length/2 - 2; i++) {
            for (int j = 0; j < matrix.length/2 - 2; j++) {
                if(matrix[i][j] == 0)
                    matrix[i][j] = k;
            }
        }


        k = 1;
        for (int i = 0; i < matrix.length / 2 - 1; i++) {
            matrix[i][matrix.length / 2] = k;
            k++;
        }
        for (int i = matrix.length / 2 - 1; i > 0; i--) {
            matrix[i][matrix.length - i - 1] = k;
            k++;
        }
        for (int i = matrix.length - 1; i > matrix.length / 2; i--) {
            matrix[0][i] = k;
            k++;
        }
        for (int i = matrix.length/2; i < matrix.length - 2; i++) {
            for (int j = matrix.length/2; j < matrix.length - 2; j++) {
                if(matrix[i][j] == 0)
                    matrix[i][j] = k;
            }
        }

        k = 1;
        for (int i = matrix.length / 2; i < matrix.length - 1; i++) {
            matrix[i][matrix.length / 2] = k;
            k++;
        }
        for (int i = matrix.length - 1; i > matrix.length / 2; i--) {
            matrix[i][matrix.length / 2 + matrix.length - i - 1] = k;
            k++;
        }
        for (int i = matrix.length - 1; i > matrix.length / 2; i--) {
            matrix[matrix.length / 2][i] = k;
            k++;
        }
        for (int i = 0; i < matrix.length/2 - 2; i++) {
            for (int j = matrix.length/2; j < matrix.length - 2; j++) {
                if(matrix[i][j] == 0)
                    matrix[i][j] = k;
            }
        }

        k = 1;
        for (int i = matrix.length / 2; i < matrix.length - 1; i++) {
            matrix[i][0] = k;
            k++;
        }
        for (int i = matrix.length - 1; i > matrix.length / 2; i--) {
            matrix[i][matrix.length - i - 1] = k;
            k++;
        }
        for (int i = matrix.length / 2 - 1; i > 0; i--) {
            matrix[matrix.length / 2][i] = k;
            k++;
        }
        for (int i = matrix.length/2; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix.length/2 - 2; j++) {
                if(matrix[i][j] == 0)
                    matrix[i][j] = k;
            }
        }
        MatrOutput(matrix);

    }
}