public class QuickSort {
    public static void quicksort(int arr[], int start, int end)
    {
        if (start < end) {
            int pivot = partition(arr, start, end);
            // recursively calling the method here
            // left side of array
            quicksort(arr, start, pivot-1 );
            // right side of array
            quicksort(arr, pivot + 1,end);
        }
    }
    // here in this partition method we are going to break down the array
    // main logic of quick sort
    public static int partition(int arr[], int p , int q )
    {
        int pivot= q;
        int i = p-1;
        for(int j =p; j<=q;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } // end of the loop
        return i;
    }
    public static void display(int arr[])
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {45, 6 ,89,2 ,30,50,2,-9};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
