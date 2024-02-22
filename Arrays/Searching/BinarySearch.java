package Arrays.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {12,24,36,48,56,68,70};

        for (int i : arr) {
            System.out.println(i);
        }


        Scanner s = new Scanner(System.in);
        System.out.print("enter Number to find Index: ");
        int num = s.nextInt();

        BinarySearch bs = new BinarySearch();
        int result= bs.search(arr,num);

        if(result==-1)
        {
            System.out.println("Element not found ");
        }
        else
        {
            System.out.println("Element found at " + result + " index");

        }
        
        s.close();

    }

    public int search(int arr[], int num)
    {

        int li= 0;
        int hi= arr.length-1;

        while (li<=hi) 
        {
            int mid= li+(hi-li)/2;

            if(arr[mid]==num)
            {
                return mid;
            }    
            else if(arr[mid]>num)
            {
                hi=mid-1;
            }
            else
            {
                li=mid+1;
            }
        }
        return -1;
    }
}
