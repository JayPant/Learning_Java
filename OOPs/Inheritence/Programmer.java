package OOPs.Inheritence;

class Employee{
    float salary=156921;
}
public class Programmer extends Employee {

    float bonus= 10000;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary of the Programmer is "+p.salary);
        System.out.println("Bonus of the Programmer is "+p.bonus);

    }
}
