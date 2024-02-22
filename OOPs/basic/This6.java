package OOPs.basic;
//this keyword can be use to return the current class instance from the method
public class This6 {
    This6 m1()
    {
        return this;
    }
    public static void main(String[] args) {
        This6 t6 = new This6();
        t6.m1(); 
    }
}
