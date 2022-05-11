package PatikaExamples;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double fiyat,kdv=0.18, kdvliFiyat, kdvFiyat;

        Scanner kb = new Scanner(System.in);
        System.out.print("Fiyat bilgisini paylaşınız : ");
        fiyat = kb.nextDouble();

        kdvFiyat = fiyat * kdv;
        kdvliFiyat = fiyat + kdvFiyat ;

        System.out.println("KDV'siz  Fiyat: " + fiyat);
        System.out.println("KDV oranı :"+ kdv);
        System.out.println("KDV Tutarı : " + kdvFiyat);
        System.out.println("KDV'li Fiyat : " + kdvliFiyat);

    }
}
