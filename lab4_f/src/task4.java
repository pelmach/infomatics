import java.util.Scanner;

public class task4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[n];
        MasInput(mas);
        GnomeSort(mas);
        BubbleSort(mas);

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
        System.out.println();
    }
    static void GnomeSort(int[] mas){
        int i = 0;
        int j = 1;
        int itr = 0;
        while (i < mas.length - 1){
            if(mas[i] <= mas[i + 1]){
                i = j;
                j++;
            } else {
                int num = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = num;
                if(i == 0){
                    i = j;
                    j++;
                }
                i--;
                itr++;
            }
        }
        MasOutput(mas);
        System.out.println("Колво итераций = " + itr);

    }
    static void BubbleSort(int[] mas){
        int itr = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = mas.length - 1; j > i; j--) {
                itr++;
                if(mas[j - 1] > mas[j]){
                    int num = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = num;
                }
            }
        }
        MasOutput(mas);
        System.out.println("Колво итераций = "+ itr);
    }
}
