package loop.ex6;

import java.util.ArrayList;

public class Divisor {
    public static boolean isDivisor(int number, int divisor) {
        return (number % divisor == 0);
    }

    static ArrayList<Integer> findDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (isDivisor(number, i)) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static int FindLargestOddDivisor(int number) {
        int max = 1;
        for (int i = 1; i <= number; i++) {
            if (isOddDivisor(i, number) && i > max) {
                max = i;
            }
        }
        return max;
    }

    public static boolean isOddDivisor(int i, int number) {
        return isDivisor(number, i) && i % 2 != 0;
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
            return getGreatestCommonDivisor(num2, num1 % num2);
    }
}
