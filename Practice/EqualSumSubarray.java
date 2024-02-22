package Practice;

public class EqualSumSubarray {

    static boolean checkArray(int[] arr,int n)
    {
        for (int i : arr) {
            if((arr[n-1]-i)== i)
            {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={15,5,6,4,8,2};
        int n= arr.length;

        for(int i=1;i<arr.length;i++)
        {
            arr[i] =arr[i-1]+arr[i];
        }

        System.out.println("Answer: "+ checkArray(arr,n));
    }
}
