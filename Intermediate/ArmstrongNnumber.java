package Intermediate;
import java.util.Scanner;
public class ArmstrongNnumber {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any Number to check: ");
        int num = s.nextInt();
        
        int length= len(num);

        int temp=num,rem,res=0;

        while (temp!=0) 
        {
            int prod=1;
            rem = temp%10;
            for(int i =0;i<length;i++)
            {
                prod= prod*rem;
            }
            res= res+prod;
            temp/=10;
        }

        if(res==num)
        {
            System.out.println(num+" is Armstrong");
        }
        else
        {
            System.out.println(num+" isn't Armstrong");
        }


        s.close();
    }
    
    
    
    public static int len(int num)
    {
        int length=0;
        while(num!=0)
        {
            length+=1;
            num/=10;
        }
        return length;
    }
}
