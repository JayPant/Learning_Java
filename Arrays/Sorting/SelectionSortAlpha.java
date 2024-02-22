package Arrays.Sorting;

import java.util.Scanner;

public class SelectionSortAlpha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter How many Elements you want in Array: ");
        n= s.nextInt();
        String[] a= new String[n];

        System.out.println("Enter Elements in the array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.next();
        }
        
        System.out.print("Elements Before Selection Sort are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        s.close();

        int min;
        String temp;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j].compareTo(a[min])<0)
                {
                   min=j; 
                }
            }
                     temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;

        }

         System.out.println("\n");
         System.out.print("Elements After Sorting  are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
