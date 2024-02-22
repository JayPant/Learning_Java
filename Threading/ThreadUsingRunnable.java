package Threading;

public class ThreadUsingRunnable implements Runnable {
    public void run()
    {
        System.out.println("Task 1 Executed");
    }

    public static void main(String[] args)
    {
        ThreadUsingRunnable tr = new ThreadUsingRunnable();
        Thread t = new Thread(tr);
        t.start();
    }
}
