import java.util.Arrays;
import java.util.Scanner;

public class LeedCode {
    int arr[];
    LeedCode(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of the array ");
//        arr=new int[sc.nextInt()];
//        System.out.println("enter the element of the array ");
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]= sc.nextInt();
//        }
    }
    public static int [] display(int arr[],int target ){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length -1; j++) {
                if(arr[i]+arr[j]==target){
                    return new  int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Leetcode obj=new Leetcode();
        int arr[]={2,7,11,15};
        System.out.println("enter  the target  value ");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println(Arrays.toString(display(arr, c)));
    }
}
