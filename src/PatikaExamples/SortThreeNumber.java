package PatikaExamples;

public class SortThreeNumber {
    public static void main(String[] args){
        java.util.Scanner kb =new java.util.Scanner(System.in);
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double c = kb.nextDouble();


        double max = Math.max(a, Math.max(b,c));
        double min = Math.min(a,Math.min(b,c));
        double mid = a+b+c-max-min;

        System.out.printf("%f>%f>%f%n", max,mid,min);
    }
}
