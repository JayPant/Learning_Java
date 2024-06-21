package OOPs.Inheritence;

class Animals{
    void eat()
    {System.out.println("Eating......");}
}

class Dogs extends Animals{
    void bark()
    {System.out.println("Barking........");}
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dogs d= new Dogs();
    d.eat();
    d.bark();
    }
}
