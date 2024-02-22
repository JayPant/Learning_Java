package Arrays.ArrayQuestion;

import java.util.Scanner;

public class FindMinMax {
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

        FindMinMax mx=  new FindMinMax();
        int min= mx.findMin(array);
        int max= mx.findMax(array);

        System.out.println("Minimum element in the array is: "+ min);
        System.out.println("Maximum element in the array is: "+ max);

    }

    public int findMax(int[] arr)
    {
        int max= arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public int findMin(int[] arr)
    {
        int min= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
