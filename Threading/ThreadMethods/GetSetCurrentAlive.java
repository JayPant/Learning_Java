package Threading.ThreadMethods;

class Test extends Thread{
    public void run()
    {
        System.out.println("thread task");
        Thread.currentThread().setName("New Thread");
        System.out.println(Thread.currentThread().getName());

    }
}
public class GetSetCurrentAlive {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Jay");
        System.out.println(Thread.currentThread().getName());

        Test t = new Test();
        t.start();

    }
}
