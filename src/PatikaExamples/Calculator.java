package PatikaExamples;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator ;
        double number1, number2, result;

        Scanner kb = new Scanner(System.in);
        System.out.println("Operator seçiniz : +, -, /, *");
        operator = kb.next().charAt(0);

        System.out.println("İlk sayıyı giriniz: ");
        number1 = kb.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        number2 = kb.nextDouble();

        switch (operator) {
            case '+' -> {
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> System.out.println("Invalid operator!");
        }
        kb.close();
    }
}
