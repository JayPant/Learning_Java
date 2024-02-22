package Patterns;

import java.util.Scanner;                           

public class Pattern24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = s.nextInt();
        int k;
        s.close();
        for(int i=1;i<=lines;i++)
        {
           if(i%2!=0)
           {
            k= (i*3)-2;
           }
           else
           {
             k= i*3;
           }

            for(int j=1;j<=3;j++)
            {
                if(i%2!=0)
                {
                   System.out.print(k+" ");
                   k++;
                }
                else
                {
                  System.out.print(k+" ");
                  k--;

                }
            }
            System.out.println();

        }
    }
}
