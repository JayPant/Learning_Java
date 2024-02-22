package Arrays.ArrayType;
public class AnonymusArray {
    public static void main(String[] args) {
        sum(new int[]{10,20,30});
    }
    static void sum(int[] array )
    {
        int total=0;
        for(int i: array)
        {
            total=total+i;
        }
        System.out.println("Sum is: "+ total);
    }
}