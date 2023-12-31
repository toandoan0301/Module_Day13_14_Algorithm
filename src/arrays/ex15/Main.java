package arrays.ex15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{8, 5, 7, 4, 8};
        int[] numbers2 = new int[]{8, 3, 9, 8, 8, 4, 7};
//        if (checkAinB(numbers1, numbers2)) {
//            System.out.println("phần tử trong mảng 1 có trong mảng 2");
//        } else {
//            System.out.println("phần tử trong mảng 1 không có trong mảng 2");
//        }

        System.out.println(countNumberMatching(numbers1, numbers2));


    }

    public static boolean checkAscending(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static boolean checkElementInArray(int[] array, int[] array2) {
        boolean flag;
        if (array.length > array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return false;
            }
        }
        return true;
    }

    public static int countNumberMatching(int[] array, int[] array2) {
        int count = 0;
        boolean flag;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    if (map.containsKey(j)) {
                        continue;
                    }
                    map.put(j, array[i]);
                    count++;
                    flag=true;
                }
                if(flag){
                    break;
                }
            }
        }
        System.out.println(map);
        return count;
    }
}
