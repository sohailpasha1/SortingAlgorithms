package sort.algorithms;

public class Quick {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partitions the array and place pivot in correct position
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap if element is smaller than or equal to pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
}
