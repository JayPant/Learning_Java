package Arrays.Sorting;

import java.util.Scanner;

public class BubbleSortAlpha {
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
        
        System.out.print("Elements Before Sorting  are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        s.close();
        String temp;
        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }

         System.out.println("\n");
         System.out.print("Elements After Sorting  are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
