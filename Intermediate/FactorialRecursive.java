package Intermediate;
import java.util.Scanner;
public class FactorialRecursive {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter Number ");
        int num = s.nextInt();

        long result= factorial(num);
        System.out.println("Factorial of "+num+" is "+ result);

        s.close();
    }

    public static long factorial(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        else{
             return num * factorial(num-1);

        }
    }
}
