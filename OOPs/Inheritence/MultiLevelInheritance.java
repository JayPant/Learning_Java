package OOPs.Inheritence;

class Animal {
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
    void run()
    {
        System.out.println("running....");
    }
}

class Puppy extends Dog{
    void speak()
    {
        System.out.println("Wooof....");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p= new Puppy();
        p.eat();
        p.run();
        p.speak();

    }
}
