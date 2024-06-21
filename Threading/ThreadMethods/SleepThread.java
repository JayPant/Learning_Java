package Threading.ThreadMethods;

public class SleepThread extends Thread{
    public void run()
    {
        try{
            for(int i =0; i<3;i++)
            {
                System.out.println(Thread.currentThread().getName()+ " "+ i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
         SleepThread t1 = new SleepThread();
         SleepThread t2 = new SleepThread();

         t1.start();
         t2.start();
    }
}
