package OOPs.basic;
// Super can be used t invoke the parent class method
class Student{
    void info(String name, String course, int roll )
    {
        System.out.println(" Student Name:"+name+" Course: "+course+" Roll Number: "+roll);
    }
}
class StudentSubject extends Student{
    void subjectList(String name, String course, int roll)
    {
        super.info(name, course,roll);
        System.out.println("Subjects are: Data Science, Java Programming");
    }
}
public class Super2 {
    public static void main(String[] args) {
        StudentSubject ss = new StudentSubject();
        ss.subjectList("Jay", "MCA", 01);
    }
}
