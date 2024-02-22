package OOPs.Inheritence;

class College{
    void collegeIntro()
    {
        System.out.println("Welcome to UPES");
    }
}

class ITProfessor extends College{
    void iTProfessor()
    {
        System.out.println("I am an IT Professor");
    }

}

class ScienceProfessor extends College{
        
    void scienceProfessor()
    {
        System.out.println("I am a Science Professor");
    }
}

    class LawProfessor extends College{
        void lawProfessor()
    {
        System.out.println("I am a LawProfessor");
    }
}


public class CollegeAssociation {
   public static void main(String[] args) {
    ITProfessor it = new ITProfessor();
    it.collegeIntro();
    it.iTProfessor();
   }
}
