package Arrays.ArrayType;
import java.util.Scanner;
public class InputInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter How many Elements you want in Array: ");
        n= s.nextInt();
        int[] a= new int[n];

        System.out.println("Enter Elements in the array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Elements in the array are: ");

         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        s.close();
    }
}
