import java.util.Scanner;

public class task7 {
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
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = k;
            k++;
        }
        for (int i = matrix.length - 2; i > 0; i--) {
            matrix[matrix.length - 1][i] = k;
            k++;
        }
        for (int i = matrix.length - 1; i > 0; i--) {
            matrix[i][0] = k;
            k++;
        }
        for (int i = 2; i < matrix.length - 1; i++) {
            matrix[i][i - 1] = k;
            k++;
        }
        for (int i = matrix.length - 3; i > 1; i--) {
            matrix[matrix.length - 2][i - 1] = k;
            k++;
        }
        for (int i = matrix.length - 2; i > 2; i--) {
            matrix[i][1] = k;
            k++;
        }


        MatrOutput(matrix);
    }
}
