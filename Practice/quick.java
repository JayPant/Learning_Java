package Practice;

public class quick {
    public static void main(String[] args) {
        int[] arr = {15,65,42,58,22,5,69,12};
        System.out.println("Elements before Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

       quick qs= new quick();
       qs.quickSort(arr, 0, arr.length-1);
       qs.printArray(arr);
    }
       

    public int partition(int[] arr,int low , int high)
    {
        int pivot = arr[low];
        while (low<=high)
        {
            while (arr[low]<pivot)
            {
              low++;  
            }
            while (arr[high]>pivot)
            {
              high--;  
            }
            if(low<=high)
            {
                swap(arr,low,high);
                low++;
                high--;
            }
        }
        return low;
    }

    public void quickSort(int[] arr, int low, int high)
    {
        int new_pivot = partition(arr, low, high);

        if(low < new_pivot-1)
        {
            quickSort(arr, low, new_pivot-1);
        }

        if(high>new_pivot)
        {
            quickSort(arr, new_pivot,high);
        }
    }


    public void swap (int[] arr, int indx1, int indx2)
    {
        int temp = arr[indx1];
        arr[indx1]=arr[indx2];
        arr[indx2]=temp;
    }

    void printArray(int[] arr)
     {
        System.out.println("\nArray After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
     }
}
