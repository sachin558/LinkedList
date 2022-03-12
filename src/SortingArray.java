import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
//    int arr[];
//    int i,j,temp;
//    SortingArray(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of  array ");
//        arr=new int[sc.nextInt()];
//        System.out.println("enter the element of the array ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//      }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,4,3};
        display(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void display(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
