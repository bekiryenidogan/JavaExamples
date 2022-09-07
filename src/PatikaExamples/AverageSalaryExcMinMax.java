package PatikaExamples;

public class AverageSalaryExcMinMax {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = salary.length;


        for ( int i = 0 ; i < n ; i++) {
            sum += salary[i] ;
            min = Math.min (min, salary[i]);
            max = Math.max (max, salary[i]);
        }

        return ( sum- min- max ) / (double)(n -2);
    }
}
