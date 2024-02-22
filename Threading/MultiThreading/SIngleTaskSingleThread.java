package Threading.MultiThreading;

public class SIngleTaskSingleThread extends Thread {
    public void run()
    {
        System.out.println("Single task from single thread ");
    }
    public static void main(String[] args) {
        SIngleTaskSingleThread st = new SIngleTaskSingleThread();
        st.start();
    }
}
