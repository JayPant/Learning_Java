package OOPs.basic;
// Super s used to invoke parent class constructor

class Animal{
    Animal()
    { System.out.println("Animal Created");}
}

class Dogs extends Animal{
    Dogs()
    {
        super();
        System.out.println("Dog is created");
    }
}
class Super3 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
    }
}
