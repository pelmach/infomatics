
import java.util.Scanner;

public class task3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[2 * n];
        MasInput(mas);
        Ellipse(mas);
    }
    static void MasInput(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }
    }
    static void Ellipse(int[] mas){
        int a = input.nextInt();
        int b = input.nextInt();
        int k = 0;
        for (int i = 0; i <= mas.length - 1; i = +2) {
            if ((Math.pow(mas[i], 2) / Math.pow(a, 2) + Math.pow(mas[i + 1], 2) / Math.pow(b, 2)) <= 1) {
                k++;
            }
            if(mas[i] == a && mas[i + 1] == b){
                k++;
            }
        }
        System.out.println(k);
    }

}
