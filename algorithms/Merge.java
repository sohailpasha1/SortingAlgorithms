package sort.algorithms;

public class Merge {
    public static void mergeSort(int[] arr) {
        //if the array has less than 2 elements, it is already sorted
        if (arr.length < 2) return;

        //find the mid
        int mid = arr.length / 2;

        // Create subarrays for left and right halves
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements to left and right subarrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        // Merge elements from left and right subarrays into arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left subarray, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right subarray, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
