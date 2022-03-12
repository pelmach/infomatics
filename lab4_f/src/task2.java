import java.util.Scanner;

public class task2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[n];
        MasInput(mas);
        LocalMax(mas);
    }
    static void MasInput(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }
    }

    static void LocalMax(int[] mas){
        int k = 0;
        for(int i = 1; i < mas.length - 1; i += 3){
            int max = mas[i];
            if (max > mas[i - 1] && max > mas[i + 1]) {
                k++;
            }
        }
        System.out.println(k);

    }
}
