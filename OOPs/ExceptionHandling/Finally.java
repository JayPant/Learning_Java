package OOPs.ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try{
            int a=120,b=0,c;
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Error occured");
        }
        finally{
            System.out.println("Finally always executes");
        }
    
    }
}
