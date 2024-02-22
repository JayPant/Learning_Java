package Practice;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {15,65,42,58,22,5,69,12};
        System.out.println("Elements before Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        
        bubble bs = new bubble();
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    bs.swap(arr, j,j+1);
                    flag=1;
                }
            }

            if(flag==0)
            {
                break;
            }
        }

        System.out.println("\nElements After Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }

    public void swap(int[] arr,int ind1 , int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
