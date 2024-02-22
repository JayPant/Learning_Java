package Basic;
public class GreaterOfThree
{
    public static void main(String[] args)
    {
        int a=10,b=200,c=30;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greater");
            }
        } 
        else if(b>c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is greater");
        }
    }
}

