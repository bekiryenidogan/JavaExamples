package PatikaExamples;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {
        double apple = 3.67,tomato = 1.11, elma,domates,tutar;


        Scanner kb = new Scanner(System.in);
        System.out.print("Elma Kilo : ");
        elma = kb.nextDouble();
        System.out.print("Domates Kilo : ");
        domates = kb.nextDouble();

        tutar = (apple*elma) + (domates*tomato);
        System.out.println("Fiyat : " + tutar);

    }
}
