package Intermediate;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int rev=0;
        
        System.out.println("enter Any Number to reverse: ");
        int num=s.nextInt();
        System.out.println("Number Before reverse: "+num);
        int temp=num;
        while (temp!=0) {
            
            int rem= temp%10;
            // System.out.print(rem);
            rev=rev*10+rem;
            temp/=10;
        }
        
        System.out.println("\n Number After reverse: "+ rev);

        s.close();
    }
}
/*
num=123
temp=123
rem=123%10=3 ->
temp=123/10=12 
 */
