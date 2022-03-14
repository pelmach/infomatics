import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        MatrInput(matrix);
        MatrOutput(matrix);
        check(matrix);

    }

    static void MatrInput(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
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

    static void check(int[][] matrix) {
        int[][] newMas = new int[matrix.length][matrix.length];
        int num = matrix[0][0];
        for (int i = 0; i < matrix.length - 1; i++) {
            matrix[i][0] = matrix[i + 1][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            matrix[matrix.length - 1][i - 1] = matrix[matrix.length - 1][i];
        }
        for (int i = matrix.length - 1; i > 0; i--) {
            matrix[i][matrix.length - 1] = matrix[i - 1][matrix.length - 1];
        }
        for (int i = matrix.length - 1; i > 0; i--) {
            matrix[0][i] = matrix[0][i - 1];
        }
        matrix[0][1] = num;
        for (int i = 1; i < matrix.length - 2; i++) {
            for (int j = 1; j < matrix.length - 2; j++) {
                if(i - 1 == 0){
                    int swap = matrix[i][j];
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j + 1] = swap;
                }
            }
        }


        MatrOutput(matrix);

    }
}
