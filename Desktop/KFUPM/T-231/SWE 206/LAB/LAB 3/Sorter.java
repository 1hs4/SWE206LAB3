import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello, word");
        int[] x = { 2, 1, 4, 8, 3, 6 };
        selectionSort(x);
        System.out.println(Arrays.toString(x));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}