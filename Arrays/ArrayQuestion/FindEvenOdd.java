package Arrays.ArrayQuestion;

import java.util.Scanner;

public class FindEvenOdd {
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

        FindEvenOdd feo= new FindEvenOdd();
        feo.findEven(array);
        feo.findOdd(array);

    }

    public void findEven(int[] arr)
    {
        int temp=0;
        System.out.print("Even Number in the array are: ");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                temp= temp+arr[i];
                System.out.print(arr[i]+" ");
            }
            
        }
            System.out.print("\nSum of even numbers are: ");
            System.out.print(temp);
    }

    public void findOdd(int[] arr)
    {
        int temp=0;
        System.out.print("\nOdd Number in the array are: ");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                temp= temp+arr[i];
                System.out.print(arr[i]+" ");
            } 
        }
            System.out.print("\nSum of odd numbers are: ");
            System.out.print(temp);
    }
}


