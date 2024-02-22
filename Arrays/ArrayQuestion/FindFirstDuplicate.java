package Arrays.ArrayQuestion;

import java.util.Scanner;

public class FindFirstDuplicate {
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

        FindFirstDuplicate fd= new FindFirstDuplicate();
        fd.find(array);


    }

    public void find(int arr[])
    {
        System.out.print("\nFirst Duplicate Elements are: ");
        int flag = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    flag=1;

                }
                
            }
            if(flag==1)
                {
                    break;
                }
        }

        if(flag==0)
        {
          System.out.print(" None");

        }
    }
}
