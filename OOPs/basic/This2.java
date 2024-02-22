//this keyword can be used to invoke current class method(implicitly)
package OOPs.basic;

public class This2 {
    void display()
    {
        System.out.println("Display function call through show method");
    }
    void show()
    {
        display();
    }
    public static void main(String[] args) {
        This2 t2= new This2();
        t2.show();
    }
}
