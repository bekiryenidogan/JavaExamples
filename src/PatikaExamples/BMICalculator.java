package PatikaExamples;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner kb = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        height = kb.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        weight = kb.nextDouble();

        bmi  = weight / Math.sqrt(height*height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
