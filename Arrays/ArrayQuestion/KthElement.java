package Arrays.ArrayQuestion;

import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = s.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the Elements: ");

        for(int i=0;i<array.length;i++)
        {
            array[i]= s.nextInt();
        }

        System.out.println("Enter the value of k: ");
        int k= s.nextInt();
        s.close();

        KthElement kth= new KthElement();

        kth.sort(array);
        int large= kth.klargest(array,k);
        int small= kth.ksmallest(array,k);

        System.out.println(k+"th"+" largest element is "+large);
        System.out.println(k+"th"+" smallest element is "+small);



    }

    public void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min =i;

            for(int j=i;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }

            if(min!=i)
            {
                int temp= arr[min];
                arr[min]=arr[i];
                arr[i]= temp;
            }
        }
    }

    public int klargest(int[] arr, int k)
    {
        return arr[arr.length-k];
    }

    public int ksmallest(int[] arr, int k)
    {
        return arr[k-1];
    }
}
