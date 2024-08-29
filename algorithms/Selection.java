package sort.algorithms;

public class Selection {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // let current index is the minimum
            int minIdx = i;
            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    // Update minIdx if a smaller element is found
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
