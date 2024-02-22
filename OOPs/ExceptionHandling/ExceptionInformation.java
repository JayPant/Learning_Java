package OOPs.ExceptionHandling;

public class ExceptionInformation {
    public static void main(String[] args) {
        int a=100,b=0,c;
        try{
            
            c=a/b;


        }catch(ArithmeticException e)
        {
            e.printStackTrace();  //mostly used and effecient
            // System.out.println(e);
            // System.out.println(e.toString());
            // System.out.println(e.getMessage());
        }
    }
}
