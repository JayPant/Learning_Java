package Patterns;
import java.util.Scanner;                           

public class Pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        int k;
        s.close();
        for(int i=1;i<=lines;i++)
        {
            k=1;
            for(int j=1;j<=i+(i-1);j++)
            {
                
                if(j>=i)
                {
                   
                    System.out.print(k+" ");
                     k--;
                }
                else
                {
                 System.out.print(k+" ");
                    k++;
                }

            }
            System.out.println();

        }
    }
}

