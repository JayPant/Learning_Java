package Threading.ThreadMethods;

public class YieldThread extends Thread{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(Thread.currentThread().getName()+" ");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.start();
        t2.start();

    }
}
