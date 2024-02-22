package Strings;
import java.util.Scanner;
public class StringPalindrome {
    public boolean checkPalindrome(String str)
    {
        String rev ="";
        for(int i = (str.length())-1;i>=0;i--)
        {
            rev = rev+ str.charAt(i);
        }

        if(str.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        StringPalindrome sp = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(sp.checkPalindrome(str))
        {
            System.out.println(str+ " is palindrome");
        }
        else
        {
            System.out.println(str+ " isn't palindrome");
        }

        sc.close();

    }
}
