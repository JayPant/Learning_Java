package OOPs.Abstraction;
interface first{
    void show();
}

public class Inetrface implements first {
    public void show()
    {
        System.out.println("HI");
    }
    public static void main(String[] args) {
        Inetrface i = new Inetrface();
        i.show();
    }
}
