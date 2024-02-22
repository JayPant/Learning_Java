package Threading;

public class ThreadUsingThread extends Thread{
    public void run()
    {
        System.out.println("Task 1 Executed");
    }

    public static void main(String[] args) {
        ThreadUsingThread tu = new ThreadUsingThread();
        tu.start();
    }
}
