package OOPs.ExceptionHandling;
import java.io.*;

class ReadandWrite{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis= new FileInputStream("abc.txt");

    }
    void saveFile() throws FileNotFoundException
    {
        String text="Hello this is new text";
        FileOutputStream fos = new FileOutputStream("xyzz.txt");
    }
}
public class ThrowsException {
    public static void main(String[] args) {
        ReadandWrite rw = new ReadandWrite();

        try{
            rw.readFile();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        // try{
        //     rw.saveFile();
        // }
        // catch(FileNotFoundException e){
        //     e.printStackTrace();
        // }

        System.out.println("Hello ");
    }
}
