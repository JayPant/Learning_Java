package OOPs.basic;
// this keyword can be used to pass as an argument in the constructor call
class Test
{
    Test(This5 t5)
    {
        System.out.println("Test class constructor");
    }
}
public class This5 {

    void m1()
    {
        Test t = new Test(this);
    }
    public static void main(String[] args) {
        This5 t5= new This5();
        t5.m1();
    }
}
