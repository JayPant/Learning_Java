package OOPs.basic;
// super can be used to refer immediate parent class instance variables
class Dog{
    String color = "White";;
}
class Tommy extends Dog
{
    void intro(){
    System.out.println("Hi i am dog tommy and have a "+ super.color);

    }
}


public class Super1 {
  public static void main(String[] args) {
    Tommy tm = new Tommy();
  tm.intro();  
  } 
}
                                                                                                                                                                                                                                                               