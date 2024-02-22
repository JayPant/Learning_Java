package Patterns;

import java.util.Scanner;                           

public class Pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        s.close();
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
