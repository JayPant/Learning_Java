package Arrays.Sorting;
import java.util.Scanner;

public class MergeSort {
    int[] array, temparray;
    int arr_length;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        System.out.print("Enter How many Elements you want in Array: ");
        n = s.nextInt();

        int[] input_array = new int[n];
        System.out.println("Enter Elements in the array: ");
        for (int i = 0; i < input_array.length; i++) {
            input_array[i] = s.nextInt();
        }
        s.close();
        MergeSort ms = new MergeSort();
        ms.sort(input_array);
        ms.printArray();
    }

    // Main sorting method that initializes sorting process
    public void sort(int[] arr) {
        this.array = arr;
        this.arr_length = arr.length;
        this.temparray = new int[arr_length];
        divideArray(0, arr_length - 1);
    }

    // Recursive method to divide the array into subarrays
    public void divideArray(int lowerindex, int higherindex) {
        if (lowerindex < higherindex) {
            int middle = lowerindex + (higherindex - lowerindex) / 2;
            divideArray(lowerindex, middle);
            divideArray(middle + 1, higherindex);
            mergeArray(lowerindex, middle, higherindex);
        }
    }

    // Merge method to merge two sorted subarrays
    public void mergeArray(int lower, int middle, int high) {
        for (int i = lower; i <= high; i++) {
            temparray[i] = array[i];
        }

        int l = lower;
        int m = middle + 1;
        int n = lower;

        while (l <= middle && m <= high) {
            if (temparray[l] <= temparray[m]) {
                array[n] = temparray[l];
                l++;
            } else {
                array[n] = temparray[m];
                m++;
            }
            n++;
        }

        // Copy the remaining elements from temparray to array
        while (l <= middle) {
            array[n] = temparray[l];
            l++;
            n++;
        }
        while (m <= high) {
            array[n] = temparray[m];
            m++;
            n++;
        }
    }

    // Print the sorted array
    public void printArray() {
        System.out.println("Elements after sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


