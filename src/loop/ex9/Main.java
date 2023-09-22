package loop.ex9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        lever1();
        lever3();
    }
    public static void lever1( ){
        int money1 = 1000;
        int money2 = 2000;
        int money5 = 5000;
        int total = 20000;
        int count = 0;
        for (int i = 1; i < total/money1; i++) {
            for (int j = 1; j < total/money2; j++) {
                for (int k = 1; k < total/money5; k++) {
                    if (money1*i + money2*j + money5*k == total) {
                        System.out.println(i +" " + j + " " +k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void lever3() {
        int[] arr = new int[]{3, 4, 5};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

}
