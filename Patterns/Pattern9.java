package Patterns;
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=(lines*2)-1;j++)
            {
                if(j>=(lines- (i-1)) && j<=(lines + (i-1) ))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
             System.out.println();

        }
        s.close();
    }
    
}
