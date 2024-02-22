package OOPs.basic;
// this keyword can be used to pass as an argument in the method call.
public class This4 {
    void m1(This4 t4)
    {
        System.out.println("I am in m1");
    }

    void m2()
    {
        m1(this);
    }
    public static void main(String[] args) {
        This4 t4 = new This4();
        t4.m2(); 
    }
}
