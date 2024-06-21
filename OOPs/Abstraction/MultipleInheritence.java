package OOPs.Abstraction;


interface rst{
 void show();
    
}

interface second {
void display();
    
}
public class MultipleInheritence implements rst,second{
    public void show()
    {
        System.out.println("Show method from interface first");
    }

    public void display()
    {
        System.out.println("display method from interface second");
    }

    public static void main(String[] args) {
        MultipleInheritence m = new MultipleInheritence();
        m.show();
        m.display();
    }
}
