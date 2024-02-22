package Intermediate;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    System.out.print("Enter any String: ");
    String str= s.next();
    System.out.println("String before reverse: "+ str);


    String rev=" ";
    int len= str.length();
    for(int i=len-1;i>=0;i--)
    {
       rev = rev + str.charAt(i);
    }
    System.out.println("String after reverse: "+ rev);
        s.close();

    }
}
