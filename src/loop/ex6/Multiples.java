package loop.ex6;

import java.util.ArrayList;

public class Multiples {
    public static ArrayList<Integer> findMultiplesLessThan100( int num){
        ArrayList<Integer> multiples = new ArrayList<>();
        for( int i = 1;i*num<100;i++){
            multiples.add(i*num);
        }
        return multiples;
    }
    public static int findLowMultiples( int num1, int num2){
        return (num1/(Divisor.getGreatestCommonDivisor(num1,num2))*num2);
    }
}
