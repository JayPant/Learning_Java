package Arrays.Sorting;
import java.util.Scanner;

public class InsertionSortAlpha {
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

      String temp;
      int j;
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            j=i;
            while(j>0 && a[j-1].compareTo(temp)>0)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;

        }

         System.out.println("\n");
         System.out.print("Elements After Sorting  are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}

