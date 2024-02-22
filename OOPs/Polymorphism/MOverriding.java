package OOPs.Polymorphism;

class Test
{
  void show()
  {
    System.out.println("1st show");

  }
  void show(String a)
  {
    System.out.println(a);
  }

  void show(String a,int b)
  {
    System.out.println(a+b);
  }
}
public class MOverriding extends Test {
    
    void show()
    {
        System.out.println("2nd show");
    }
    void show(String b)
    {
        System.out.println(b);
    }
    void show(String a,int b)
    {
      System.out.println(a+b);
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.show("STring 1st method");
        t.show("Same sequence " ,1);

        MOverriding m = new MOverriding();
        m.show();
        m.show("String 2nd method");
        m.show("Same sequence " ,2);
        

    }
}