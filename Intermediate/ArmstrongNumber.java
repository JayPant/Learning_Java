package Intermediate;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Any Three Digit Number: ");
            int num = s.nextInt();
            isArmstrong(num);
            s.close();
    }    

    public static void isArmstrong(int num)
    {
        int temp=num,rem,res=0;
        
        while (temp!=0) 
        {
            rem=temp%10;
            res= res+(rem*rem*rem); 
            temp/=10;
        }
        if(num==res)
        {
            System.out.println(num+" is Armstrong");
        }
        else
        {
            System.out.println(num+" isn't Armstrong");
        }
    }
}

