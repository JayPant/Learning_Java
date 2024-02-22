package Arrays.Sorting;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of elements you want to enter: ");
        int n = s.nextInt();

        System.out.println("Enter the Values: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
    }

    // The main sorting method that performs Heap Sort
    public void sort(int[] arr) {
        int len = arr.length;

        // Build a max heap
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }

        // Extract elements from the heap one by one
        for (int i = len - 1; i >= 0; i--) 
        {
            // Swap the root (maximum element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to heapify a subtree rooted with the given index
    public void heapify(int[] arr, int len, int index) {
        int parent_node = index;
        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;

        // Check if the left child is larger than the root
        if (left_child < len && arr[left_child] > arr[parent_node]) {
            parent_node = left_child;
        }
        // Check if the right child is larger than the root
        if (right_child < len && arr[right_child] > arr[parent_node]) {
            parent_node = right_child;
        }

        // If the largest element is not the root, swap them
        if (parent_node != index) {
            int temp = arr[index];
            arr[index] = arr[parent_node];
            arr[parent_node] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, len, parent_node);
        }
    }

    // Function to print the array
    public void printArray(int[] arr) {
        System.out.println("Elements after Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
