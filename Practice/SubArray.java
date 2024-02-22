package Practice;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {-10,-3, -2, 1 , 4, 5};

        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]*arr[i];
        }

        int  left=0,right=arr.length-1;

        int[] ans = new int[arr.length];

        int k=arr.length-1;
        while(left<=right)
        {
            if(arr[left]>arr[right])
            {
            ans[k--]= arr[left];
            left++;
            }else{
                ans[k--]=arr[right];
                right--;
            }
        }

        for (int i : ans) {
            System.out.print(i+" ");
        }

    }
}
