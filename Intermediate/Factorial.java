package Intermediate;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Any number: ");
        int num = s.nextInt();
        int fact=num;
        for(int i=num-1;i>0;i--)
        {
            fact= fact*i;
        }
         System.out.println("Factorial is: "+fact);
        s.close();
    }
}

/*  factorial(n)
 5*4*3*2*1 
 fact(n-1)*n 
 
 */