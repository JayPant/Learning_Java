package Practice;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {15,65,42,58,22,5,69,12};
        System.out.println("Elements before Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        
        Selection ss= new Selection();
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                ss.swap(arr,min,i);
            }
        }

         System.out.println("\nElements After Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public void swap (int[] arr, int indx1, int indx2)
    {
        int temp = arr[indx1];
        arr[indx1]=arr[indx2];
        arr[indx2]=temp;
    }
}
