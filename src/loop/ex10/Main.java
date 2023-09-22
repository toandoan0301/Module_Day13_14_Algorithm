package loop.ex10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    lever2();
    lever3();
    }
    public static void lever2() {
        int[] arr = new int[]{3, 4, 4};
        int size = arr.length;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (isOther(i, j, k)) {
                        addNumber(arr, i, j, k, strings);
                    }
                }
            }
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
    
    public static void lever3() {
        int[] arr = new int[]{1, 0, 4};
        int size = arr.length;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (isOther(i, j, k) && arr[i] != 0) {
                        addNumber(arr, i, j, k, strings);
                    }
                }
            }
        }
        System.out.println("kết của có thể trùng, và bằng 0 là:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static boolean isOther(int i, int j, int k) {
        return i != j && j != k && k != i;
    }

    private static void addNumber(int[] arr, int i, int j, int k, ArrayList<String> strings) {
        String newStr = "" + arr[i] + arr[j] + arr[k];
        boolean flag = false;
        for (String str : strings) {
            if (str.equals(newStr)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return;
        } else {
            strings.add(newStr);
        }
    }
}
