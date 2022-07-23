package PatikaExamples;

import java.util.Scanner;

public class CiftSayılar {
    public static void main(String[] args){
        int k;
        Scanner kb =new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k= kb.nextInt();

        for (int i = 1 ; i <= k ; i++){
            if( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
