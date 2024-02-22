package Arrays.Searching;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = s.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the Elements: ");

        for(int i=0;i<array.length;i++)
        {
            array[i]= s.nextInt();
        }

        System.out.println("Enter the element to find: ");
        int search_element= s.nextInt();


        LinearSearch  ls = new LinearSearch();
        int result =   ls.searchElement(array,search_element);

        if(result == -1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println("Element found at "+ result + " index");
        }
                s.close();

    
    }    

    int searchElement(int[] arr, int element )
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
            
        }
                        return -1;

    }
}
