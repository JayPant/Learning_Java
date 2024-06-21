package Threading.ThreadMethods;

public class GetSetPriority extends Thread{
    public void run()
    {
        System.out.println("Running the run method");
    }

    public static void main(String[] args) {
        GetSetPriority t1 = new GetSetPriority();
        GetSetPriority t2 = new GetSetPriority();
        GetSetPriority t3 = new GetSetPriority();

        System.out.println("Thread 1 "+t1.getPriority());
        System.out.println("Thread 2 "+t2.getPriority());
        System.out.println("Thread 3 "+t3.getPriority());

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);

        System.out.println("Thread 1 "+t1.getPriority());
        System.out.println("Thread 2 "+t2.getPriority());
        System.out.println("Thread 3 "+t3.getPriority());
    }
}
