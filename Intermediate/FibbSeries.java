package Intermediate;
import java.util.Scanner;
public class FibbSeries {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    System.out.print("Enter how many elements you want see? ");
    int range= s.nextInt();

    int a=0,c,b=1,i=1;
    System.out.print(a+"\t");
    System.out.print(b);

    while(i<=range-2)
    {
        c=a+b;
        System.out.print("\t"+c);
        a=b;
        b=c;
        i++;
    }
    s.close();
    }
}
 