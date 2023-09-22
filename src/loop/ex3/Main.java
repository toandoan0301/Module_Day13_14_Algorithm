package loop.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In ra các số chính phương từ a đến b");
        System.out.print("Nhập số a: ");
        int numberA = input.nextInt();
        System.out.print("Nhập số b: ");
        int numberB = input.nextInt();
        System.out.println("Số chính phương từ a tới b là: ");
        for (int i = numberA; i <= numberB; i++) {
            if (SquareNumber.isSquareNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
