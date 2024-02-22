package Practice;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {15,65,42,58,22,5,69,12};
        System.out.println("Elements before Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        int j;
        for(int i =1;i<arr.length;i++)
        {
            int temp = arr[i];
            j =i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }

        System.out.println("\nElements After Swapping are: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
