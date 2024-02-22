package Arrays.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter How many Elements you want in Array: ");
        n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements in the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Elements Before Selection Sort are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        s.close();

        int min, temp;
        // Selection Sort Algorithm
        for (int i = 0; i < a.length; i++) {
            min = i;
            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("\n");
        System.out.print("Elements After Sorting  are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
