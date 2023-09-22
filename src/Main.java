import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 7, 6, 5, 3, 2, 1};
//        bubbleSort(numbers);
//        selectionSort(numbers);
        insertionSort(numbers);
//        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int temp = arrays[min];
            arrays[min] = arrays[i];
            arrays[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int pos, value;
        for (int i = 1; i < array.length; i++) {
            System.out.println(i);
            pos = i;
            value = array[pos];
            while (pos > 0 && value < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            array[pos] = value;
            System.out.println(Arrays.toString(array));

//            System.out.println(i);
//            for (int j =i; j >0 ; j--) {
//                if (array[j]<array[j-1]) {
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
//                }
//                System.out.println(Arrays.toString(array));
//            }
        }
    }
}