package Threading.MultiThreading;

class Movie extends Thread {
    public void run()
    {
        System.out.println("Movie Started");
    }
}


class Audio extends Thread{
    public void run()
    {
        System.out.println("Audio Started");
    }
}


class Video extends Thread{
    public void run()
    {
        System.out.println("Video Started");
    }
}

class Clock extends Thread{
    public void run()
    {
        System.out.println("Timer Started");
    }
}

public class MultipleTaskMultiThread{
    public static void main(String[] args) {
        Movie m = new Movie();
        m.start();

        Audio a = new Audio();
        a.start();

        Video v = new Video();
        v.start();

        Clock c = new Clock();
        c.start();
    }
}



