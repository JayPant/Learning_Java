package Patterns;

import java.util.Scanner;                           

public class Pattern23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        int k,m;
        s.close();
        for(int i=1;i<=lines;i++)
        {
            k=i;
            m=4;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k= k+m;
                m--;
            }
            System.out.println();

        }
    }
}
