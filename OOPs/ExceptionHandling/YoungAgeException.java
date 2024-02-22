package OOPs.ExceptionHandling;

import java.util.Scanner;

public class YoungAgeException extends RuntimeException {
            
   YoungAgeException(String s)
   {
      super(s);
   }
   public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                System.out.println("Enter your Age: ");
                int age = s.nextInt();
                  s.close();

            try{
                  if(age<18)
                     {
                        throw new YoungAgeException("You're not Eligible");
                     }
                  else
                     {
                        System.out.println("Vote Registered Sucessfully");
                     }
                  }
            catch(YoungAgeException y)
            {
               System.out.println(y.getMessage());
               // y.printStackTrace();
            }

                
             }
}
