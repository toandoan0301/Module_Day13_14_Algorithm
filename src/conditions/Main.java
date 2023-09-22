package conditions;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        bai1Lv3();
    }

    public static void bai1Lv3() {
        System.out.println("Nhập độ dài 3 cạnh của tam giác!");
        double side1 = input.nextInt();
        double side2 = input.nextInt();
        double side3 = input.nextInt();
        input.nextLine();
        System.out.println(checkTriangleType(side1, side2, side3));
    }

    public static String checkTriangleType(double side1, double side2, double side3) {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            if (isEquilateralTriangle(side1, side2, side3)) {
                return "Tam Giác Đều";
            } else if (isOscelesTriangle(side1, side2, side3)) {
                return "Tam Giác Cân";
            } else if (isSquareTriangle(side1, side2, side3)) {
                return "Tam Giác Vuông";
            } else if (isObtuseTriangle(side1, side2, side3)) {
                return "Tam Giác Tù";
            }
            return "Tam giác nhọn";
        }
        return "Không phải 3 cạnh của tam giác";
    }

    private static boolean isEquilateralTriangle(double side1, double side2, double side3) {
        return side1 == side2 && side1 == side3;
    }

    private static boolean isOscelesTriangle(double side1, double side2, double side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    private static boolean isSquareTriangle(double side1, double side2, double side3) {
        return Math.pow(side1, 2) == sumOfSquares(side2, side3) ||
                Math.pow(side2, 2) == sumOfSquares(side1, side3) ||
                Math.pow(side3, 2) == sumOfSquares(side1, side2);
    }

    private static boolean isObtuseTriangle(double side1, double side2, double side3) {
        return Math.pow(side1, 2) > sumOfSquares(side2, side3) ||
                Math.pow(side2, 2) > sumOfSquares(side1, side3) ||
                Math.pow(side3, 2) > sumOfSquares(side1, side2);
    }

    public static double sumOfSquares(double number1, double number2) {
        return Math.pow(number1, 2) + Math.pow(number2, 2);
    }
}
