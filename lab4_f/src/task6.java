import java.util.Scanner;

public class task6 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        MatrInput(matrix);
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMas[j][matrix.length - i - 1] = matrix[i][j];
            }

        }
        MatrOutput(matrix);
        MatrOutput(newMas);
    }
}
