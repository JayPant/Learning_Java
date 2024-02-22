package Arrays.Sorting;

import java.util.Scanner;

public class InsertionSort {
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

        System.out.print("Elements Before Insertion Sort are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        s.close();

        int temp, j;
        // Insertion Sort Algorithm
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            // Shift elements greater than temp to the right
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            // Place temp in the correct position
            a[j] = temp;
        }

        System.out.println("\n");
        
        System.out.print("Elements After Sorting are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
