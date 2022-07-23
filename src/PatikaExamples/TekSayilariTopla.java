package PatikaExamples;

import java.util.Scanner;

public class TekSayilariTopla {
    public static void main(String[] args){
        int n;
        int total=0;

        Scanner kb = new Scanner(System.in);
        System.out.println("Tamamlamak için 0");
        do {
            System.out.println("Sayı Giriniz :");
            n= kb.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        } while (n > 0);

        System.out.println(" Toplam: "+ total );
    }
}
