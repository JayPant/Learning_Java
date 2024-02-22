package Intermediate;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        boolean isPrime=true;
        
        System.out.print("Enter any Number to check: ");
        int num= s.nextInt();
        
        
        for(int i =2;i<num; i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }


        if(isPrime)
        {
            System.out.println(num+" is Prime");
        }
        else
        {
             System.out.println(num+" isn't Prime");

        }
        s.close();
    }
}

// import java.util.Scanner;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         boolean isPrime = true;

//         System.out.print("Enter any Number to check: ");
//         int num = s.nextInt();

//         // Check for divisibility by numbers from 2 to num-1
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 isPrime = false;  // Set to false if the number is divisible by any i
//                 break;  // Exit the loop since we already know it's not prime
//             }
//         }

//         if (isPrime) {
//             System.out.println(num + " is Prime");
//         } else {
//             System.out.println(num + " isn't Prime");
//         }

//         s.close();
//     }
// }

