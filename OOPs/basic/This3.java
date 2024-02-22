package OOPs.basic;
// this() keyword can be used to invoke the constructor
public class This3 {
    This3()
    {
        // this(10);
        System.out.println("No args constructor");
    }

    This3(int a)
    {
        this();
        System.out.println("Paramteriezed COnstructor");
    }

    public static void main(String[] args) {
        This3 t3 = new This3(10);
    }
}