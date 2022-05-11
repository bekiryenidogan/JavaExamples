package PatikaExamples;

import java.util.Scanner;

public class Taksimetre {
    public static void main (String [] args){
        int km ;
        double perKm = 2.2, startPrice = 10 , total ;

        Scanner kb = new Scanner(System.in);
        System.out.print(" Gidilen mesafeyi km cinsinden giriniz :");
        km = kb.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total<20) ? 20 : total ;

        System.out.println(" Toplam tutar: " + total);
    }

}
