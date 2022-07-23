package PatikaExamples;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println(" Sayı : ");
         int n = kb.nextInt();
         int total = 1;

        for (int i = 1; i <= n ; i++)
            total = total * i;
        System.out.println( n + " Factorial : "+ total);
    }

}
