package OOPs.ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        System.out.println("Age criteria not met");
    }
    InvalidAgeException(String str)
    {
        super(str);
    }

}

class CheckException
{
    void checkAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Invalid age");
        }
        else
        {
            System.out.println("Welcome to Voting");
        }
    }
}
public class CustomException  {
    public static void main(String[] args) {
        CheckException ce = new CheckException();
        
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = s.nextInt();
            ce.checkAge(age);
            s.close();
        
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
