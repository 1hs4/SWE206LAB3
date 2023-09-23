import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello, word");
        int[] x = { 2, 1, 4, 8, 3, 6 };
        selectionSort(x);
        System.out.println(Arrays.toString(x));
        int[] y = { 2, 1, 4, 8, 3, 6 };
        insertionSort(y);
        System.out.println(Arrays.toString(y));
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

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void sort(int[] array) {
        insertionSort(array);
        selectionSort(array):
    }
    
}
