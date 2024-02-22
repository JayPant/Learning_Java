package Intermediate;
public class Prime1to100 {
    public static void main(String[] args) {
        int check;
                for(int i=1;i<101;i++)
                {
                    check= primefunc(i);
                    if(check==1)
                    {
                        System.out.println(i);
                    }
                }


    }
    public static int primefunc(int x){
        boolean isPrime=true;   
        for(int i =2;i<x; i++)
        {
            if(x%i==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
        {
            return 1;
        }
        else
        {
             return 0;
        }
}
}
