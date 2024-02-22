package Arrays.Sorting;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, arr_length;
        System.out.print("Enter How many Elements you want in Array: ");
        n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        arr_length = arr.length;
        QuickSort qs = new QuickSort();
        qs.quickSorting(arr, 0, arr_length - 1);
        qs.printArray(arr);
    }

    // Function to partition the array and return the pivot index
    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }

            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                // Swap elements at low and high indices
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    // Function to perform quicksort on the array
    void quickSorting(int[] arr, int low, int high) {
        // Find the pivot index and recursively sort the subarrays
        int new_piv = partition(arr, low, high);

        if (low < new_piv - 1) {
            quickSorting(arr, low, new_piv - 1);
        }
        if (new_piv < high) {
            quickSorting(arr, new_piv, high);
        }
    }

    // Function to print the array
    void printArray(int[] arr) {
        System.out.println("Array After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
