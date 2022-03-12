import java.util.Scanner;

public class task5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        MatrInput(matrix);
        sort(matrix);
        MatrOutput(matrix);


    }
    static void MatrInput(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
    static void MatrOutput(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    static void sort(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int max = 0;
            int k = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    k = j;
                }
            }
            matrix[i][k] = matrix[i][i];
            matrix[i][i] = max;
        }


    }

}
