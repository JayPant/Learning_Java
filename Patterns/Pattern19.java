package Patterns;

import java.util.Scanner;                           

public class Pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        int k=0;
        s.close();
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                k++;
                System.out.print(k+" ");
                if(i==j)
                {
                    System.out.println();
                }
            }

        }
    }
}
