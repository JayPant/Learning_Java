package OOPs.Polymorphism;

public class MOverloading {
    void show()
    {
        System.out.println("1st Show Method");
    }

    void show(int a)
    {
        System.out.println(a+"nd Show Method");
    }

    void show(int a, int b)
    {
        System.out.println(b+"rd Show Method");
    }
    void show(String a,int b)
    {
        System.out.println(b+"th Show Method");
    }
    void show(String a)
    {
        System.out.println(a+" Show Method");
    }

    public static void main(String[] args) {
        MOverloading m= new MOverloading();
        m.show();
        m.show(2);
        m.show(2,3);
        m.show("4th",4);
        m.show("5th");
    }
}
 