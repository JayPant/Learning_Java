package Arrays.ArrayQuestion;

import java.util.Scanner;

public class SingleOccurence {
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

        System.out.print("\nElements in the arrays are: ");
        for (int i : array) {
            System.out.print(i+" ");
        }

        SingleOccurence so= new SingleOccurence();
        so.find(array);
    }

    public void find(int arr[])
    {
        System.out.print("\nSingle Occurrence Elements are: ");
        int flag=0;

        for(int i=0;i<arr.length;i++)
        {
            flag=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag++;
                }
                
            }
            if(flag==1)
            {
                System.out.print(arr[i]+" ");
            }
        }

        if(flag>1)
        {
            System.out.println(" None");
        }

    }
}
