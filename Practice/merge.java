package Practice;

public class merge 
    {
        int[] array,temp_array;
        int arr_length;
        public static void main(String[] args) {
            int[] arr = {14,84,65,8,12,6,41};
        System.out.println("Elements before Swapping are: ");
        for (int i : arr) 
        {
            System.out.print(i+ " ");
        }

        merge ms= new merge();
        ms.sort(arr);
        ms.printArray();

       
        }

        public void sort(int[] arr)
        {
            this.array=arr;
            this.arr_length=arr.length;
            this.temp_array= new int[arr_length];
            divideTheArray(0,arr_length-1);
        }

        public void divideTheArray(int low,int high)
        {
            if(low<high)
            {
                int middle= low+(high-low)/2;
                divideTheArray(low, middle);
                divideTheArray(middle+1, high);
                mergeTheArray(low,middle,high);
            }
        }

public void mergeTheArray(int low_index, int mid_index, int high_index) {
    for (int i = 0; i < array.length; i++) {
        temp_array[i] = array[i];
    }

    int l = low_index;
    int m = mid_index + 1;
    int lt = low_index;

    while (l <= mid_index && m <= high_index) {
        if (temp_array[l] <= temp_array[m]) {
            array[lt] = temp_array[l];
            l++;
        } else {
            array[lt] = temp_array[m];
            m++;
        }
        lt++;
    }

    while (l <= mid_index) {
        array[lt] = temp_array[l];
        l++;
        lt++;
    }
    while (m <= high_index) {
        array[lt] = temp_array[m];
        m++;
        lt++;
    }
}


    public void printArray() 
     {
        System.out.println("\nArray After Sorting: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
     }
    }
