import java.util.Scanner;

public class testing_task7 {
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
        int num = matrix.length - 1;
        System.out.println(num);
        int k = 1;
        for(int x = 0; x < matrix.length - 1; x++) {
            for (int i = x; i < matrix.length - 1 - x; i++) {
                matrix[x][i] = k;
                k++;
            }
            for (int i = x; i < matrix.length - 1 - x; i++) {
                matrix[i][matrix.length - 1 - x] = k;
                k++;
            }
            for (int i = matrix.length - 1 - x; i > x; i--) {
                matrix[matrix.length - 1 - x][i] = k;
                k++;
            }
            for (int i = matrix.length - 1 - x; i > x; i--) {
                matrix[i][x] = k;
                k++;

            }
        }

        MatrOutput(matrix);

    }
}
