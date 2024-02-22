package OOPs.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a=100,b=0,c;
        try{
            
            c=a/b;
        


        }catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Can't divide by 0");
        }

    }
}
  