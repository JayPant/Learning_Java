package Arrays.ArrayQuestion;

import java.util.Scanner;

public class SecondLargeSmall {
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
        s.close();

        SecondLargeSmall ls= new SecondLargeSmall();

        ls.sort(array);

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

        System.out.println("Second Largest elememt in the array is "+ arr[arr.length-2]);
        System.out.println("Second Smallestt elememt in the array is "+ arr[1]);

    }
}
