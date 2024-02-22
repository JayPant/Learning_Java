package Patterns;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class check{
    public static void main(String[] args) {
        int lines=4;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=lines;j++)
            {
               if(j>=lines-(i-1))
               {
                   System.out.print(" *");
               }
               else
               
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        
    }
}
