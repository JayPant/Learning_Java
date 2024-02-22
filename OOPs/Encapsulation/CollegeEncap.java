package OOPs.Encapsulation;

class Student{
    private String name;
    public void setName(String s_name)
    {
        name= s_name;
    }

    public String getName()
    {
        return name;
    }
}
public class CollegeEncap {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("Jay");
        System.out.println("Name of the Student is: "+s1.getName());
    }
}
