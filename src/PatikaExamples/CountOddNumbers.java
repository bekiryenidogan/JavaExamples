package PatikaExamples;

public class CountOddNumbers {
    public int countOdds(int low, int high) {


        int diff = high -low ;

        if (isEven(low) && isEven(high)) {
            return (diff) / 2 ;
        }else {
            return ( diff / 2) +1 ;
        }
    }

    public boolean isEven ( int num) {
        return ( num % 2 == 0 );
    }
}
