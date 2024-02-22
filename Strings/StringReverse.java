package Strings;

import java.util.Scanner;

public class StringReverse {

    public String printReverse(String str)
    {
        String rev = "";
        for(int i= (str.length()-1); i>=0;i--)
        {
            rev= rev+ str.charAt(i);
        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string to reverse: ");
        String str = s.next();

        StringReverse sr = new StringReverse();
         String result = sr.printReverse(str);

         System.out.println("reverse of the string is: "+ result.toLowerCase());
         s.close();
    }
}
