package Intermediate;
import java.util.Scanner;
public class PalidromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to Check Palindrome: ");
        int num = s.nextInt();
        checkReverse(num);
        s.close();
    }
    
    
    
    
    
    
    public static void checkReverse(int num)
    {
        int temp=num,rev=0,rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(rev==num)
        {
            System.out.println(num+" is palindrome");
        }
        else
        {
            System.out.println(num+" is not palindrome");
        }
    }
}
