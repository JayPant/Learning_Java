package Practice;

public class abcmerge {
    int[] array,temp_array;
    int len;

    public static void main(String[] args) {
        int[] arr= {18,65,45,25,3,96};

        System.out.println("Elements before Swapping: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        abcmerge abc = new abcmerge();
        abc.sort(arr);
        abc.printArray();

    }


    public void sort(int[] arr)
    {
        this.array= arr;
        this.len=arr.length;
        this.temp_array= new int[len];
        divide(0, len-1 );

    }

    public void divide(int li, int hi)
    {
        if(li<hi)
        {
            int mid= li + (hi-li)/2;

            divide(li,mid);
            divide(mid+1,hi);
            finalArray(li,mid,hi);
        }
    }

    public void finalArray(int low, int mid, int high)
    {
        for(int i=0;i<array.length;i++)
        {
            temp_array[i]=array[i];
        }

        int l=low;
        int m= mid+1;
        int n=low;

        while(l<=mid && m<=high)
        {
            if(temp_array[l]<=temp_array[m])
            {
                array[n]= temp_array[l];
                l++;
            }
            else
            {
                array[n]= temp_array[m];
                m++;
            }
            n++;
        }

        while (l<=mid) 
        {
            array[n]=temp_array[l];
            l++;
            n++;    
        }
         while (m<=high) 
        {
            array[n]=temp_array[m];
            m++;
            n++;    
        }
    }

    public void printArray()
    {
        System.out.println("\nElements after Sorting");
        for (int i : array) {
            System.out.print(i +" ");
        }
    }

}


