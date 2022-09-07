package PatikaExamples;

public class NumberOFOneBits {
    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);

        int count = 0;

        for( int i= 0; i <= s.length() -1 ; i++)
            if(s.charAt(i) == '1')
                count++;
        return count;
    }
}
