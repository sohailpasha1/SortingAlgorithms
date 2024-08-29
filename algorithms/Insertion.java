package sort.algorithms;

public class Insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // starting from index 1
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements of arr[j] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place key at its correct position
            arr[j + 1] = key;
        }
    }
}
