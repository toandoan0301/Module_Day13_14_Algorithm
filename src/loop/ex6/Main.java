package loop.ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhấp số a: ");
        int numA = input.nextInt();
//        System.out.println("Ước số của " + numA + " là: ");
//        for (Integer divisor : Divisor.findDivisors(numA)) {
//            System.out.println(divisor);
//        }
//        System.out.println("Bội Số nhỏ hơn 100 của " + numA + " là: ");
//        for (Integer multiples : Multiples.findMultiplesLessThan100(numA)) {
//            System.out.println(multiples);
//        }
//        System.out.println("Ước số lẻ lớn nhất là: " + Divisor.FindLargestOddDivisor(numA));
//        if (numA % 2 != 0){
//            System.out.println("Bội chẵn nhỏ nhất là: "+numA*2);
//        }else{
//            System.out.println("Bội chẵn nhỏ nhất là: "+numA);
//        }

        System.out.println("Nhập số b: ");
        int numB= input.nextInt();
        System.out.println("ước chung lớn nhất của a và b là: ");
        System.out.println(Divisor.getGreatestCommonDivisor(numA,numB));
        System.out.println("Bội chung nhỏ nhất là:");
        System.out.println(Multiples.findLowMultiples(numA,numB));
    }
}
