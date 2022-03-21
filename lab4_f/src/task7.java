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
        int num = (int) ((Math.pow(matrix.length, 2) - matrix.length)/2 + matrix.length);
        System.out.println(num);
        int i = 2;
        int j = 1;
        while (k < num){
            while (matrix[i + 1][j + 1] == 0){
                matrix[i][j] = k;
                k++;
                i++;
                j++;
            }
            while (matrix[i][j - 1] == 0){
                matrix[i][j] = k++;
                j--;
            }
            while (matrix[i - 1][j] == 0){
                matrix[i][j] = k;
                k++;
                i--;
            }
            if(matrix[i][j] == 0){
                matrix[i][j] = k;
            }
        }
        MatrOutput(matrix);
    }

}
