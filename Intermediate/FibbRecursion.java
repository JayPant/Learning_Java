package Intermediate;
import java.util.Scanner;

public class FibbRecursion {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter how many elements you want see? ");
    int range= s.nextInt();

    for(int i=0;i<range;i++)
    {
        System.out.println(fib(i) + " ");
    }

    s.close();
    }

    public static int fib(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            return fib(num-1)+fib(num-2);
        }
    }
}
