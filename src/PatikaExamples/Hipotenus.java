package PatikaExamples;

import java.util.Scanner;

public class Hipotenus {
    public static void main (String[] args){
        double a,b,c;

        Scanner kb = new Scanner(System.in);
        System.out.print (" 1. Kenarı giriniz : ");
        a = kb.nextDouble();

        System.out.print (" 2. Kenarı giriniz : ");
        b = kb.nextDouble();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);
    }
}
