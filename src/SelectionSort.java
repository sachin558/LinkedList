import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,3,2};
        diplay(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void diplay(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int indei=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[indei]){
                    indei=j;
                }
            }
            int smallnum=arr[indei];
            arr[indei]=arr[i];
            arr[i]=smallnum;
        }
    }
}
