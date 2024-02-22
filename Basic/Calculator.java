package Basic;
import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
         Scanner s= new Scanner(System.in);
         int yn;

      do{

        int a,b,result;

        System.out.println("Enter First Number: ");
        a= s.nextInt();

        System.out.println("Enter Second Number: ");
        b= s.nextInt();


        System.out.println("Enter your Choice\n1: Addition\n2: Subtract\n3: Multiplication\n4: Division\n5: Remainder ");
        int choice = s.nextInt();

        switch (choice) {
            
            case 1:
                result=a+b;
                System.out.println("Addition: "+ result);
                break;
        
            case 2:
                result=a-b;
                System.out.println("Subtraction: "+ result);
                break;
            
            case 3:
                result=a*b;
                System.out.println("Multiplication: "+ result);
                break;
            
            case 4:
                result=a/b;
                System.out.println("Division: "+ result);
                break;
            
            case 5:
                result=a%b;
                System.out.println("Remainder: "+ result);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println("DO you want to Continue?\nPress 1 for Yes and 0 for No");
      yn = s.nextInt();
      }while(yn==1);


        s.close();

    }    
}
