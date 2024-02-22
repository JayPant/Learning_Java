package Practice;

import java.util.Scanner;

public class Ques2 {
    public void getDurationString(int minutes, int seconds)
    {
        if(minutes>=0 && (seconds>=0 && seconds<=59))
        {
            int hr= minutes/60;
            int min= minutes%60;
            System.out.println(hr+"h "+min+"m "+seconds+"s");

        }
        else
        {
            System.out.println("Invalid value");
        }
    }
    public void getDurationString(int minutes)
    {
        if(minutes>=0 )
        {
            int min= minutes*60;
            System.out.println(min+" s");

        }
        else
        {
            System.out.println("Invalid value");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Minutes: ");
        int min= s.nextInt();

        System.out.println("Enter Seconds: ");
        int sec= s.nextInt();
        Ques2 s1 = new Ques2();
        s1.getDurationString(min,sec);
        s1.getDurationString(min);

    }
}
