package PatikaExamples;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String [] args) {
        int n ;
        Scanner kb = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = kb.nextInt();

        for (int i = 1; i <= n ; i *= 2) {
            System.out.println(i);

        }
    }
}
