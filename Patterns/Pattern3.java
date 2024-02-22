package Patterns;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of lines: ");
        int lines = s.nextInt();
        s.close();
        for(int i =1;i<=lines/2;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =(lines/2);i<=lines;i++)
        {
            for(int j=1;j<=(lines+1)-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
