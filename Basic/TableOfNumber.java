package Basic;
import java.util.Scanner;
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int num;
        System.out.println("Enter Number: ");
        num= s.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.println(num + "X " + i +"="+ num*i);
        }
        s.close();
    }
}
 