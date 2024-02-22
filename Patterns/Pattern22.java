package Patterns;
import java.util.Scanner;                           

public class Pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        int k;
        s.close();
        for(int i=lines;i>0;i--)
        {
            k=5;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k--;

            }
            System.out.println();

        }
    }
}

