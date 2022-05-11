package PatikaExamples;

import java.util.Scanner;

public class DaireAlan {
    public  static  void  main (String [] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print(" Dairenin yarıçapını giriniz :");
        double radius = kb.nextDouble();
        double area = Math.PI * (radius*radius);
        System.out.println("Dairenin alanı : " + area);

        double circumference = Math.PI * 2* radius;
        System.out.println("Dairenin Çevresi : " + circumference);
    }
}
