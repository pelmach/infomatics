import java.util.Scanner;


public class task1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[n];
        MasInput(mas);
        Revers(mas);

    }
    static void MasInput(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }
    }
    static void MasOutput(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
    static  void Revers(int[] mas){
        int[] newMas =new int[6];
        double num = 0;
        for (int i = 0; i < mas.length; i++) {
            num += mas[i]/Math.pow(6, i + 1);
        }
        System.out.println(num);
        num *= Math.pow(10, newMas.length);
        for (int i = 0; i < newMas.length; i++) {
            newMas[newMas.length - 1 - i] += num % 10;
            num /= 10;
        }
        MasOutput(newMas);
    }
}
