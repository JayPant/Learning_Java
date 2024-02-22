package Threading.MultiThreading;

public class SingletaskFromMultiThread extends Thread{
    public void run()
    {
        System.out.println("Peroforming Single Task From Multiple threads");
    }

    public static void main(String[] args) {
        SingletaskFromMultiThread sm = new SingletaskFromMultiThread();
        sm.start();
    }
}
