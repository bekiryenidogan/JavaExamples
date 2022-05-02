package PatikaExamples;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        int NotToplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ders sayısını giriniz: ");

        int NumberOfClasses = scan.nextInt();
        int[] Notlar = new int[NumberOfClasses];
        System.out.println(" Ders Notlarını Giriniz: ");

        for(int i = 0; i < NumberOfClasses; ++i) {
            Notlar[i] = scan.nextInt();
            NotToplam += Notlar[i];
        }

        double Ortalama = (NotToplam / NumberOfClasses);
        System.out.printf("Ortalamanız: " + Ortalama);
    }
}
