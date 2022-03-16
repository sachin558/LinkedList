import java.util.Scanner;

public class BinarySearchString {
    String s,target;
    String arr[];
    int S,e,target1,i,j;
    BinarySearchString(){
        Scanner sc=new Scanner(System.in);
        s="enter the  name of the  Anurag ";
        arr=s.split(" ");
        S=0;
//        System.out.println("enter the target element in the string search in the sting array is the present or not ");
//        target=sc.nextLine();
//        target1=target.length();

    }
    void Sorting (){
        for ( i = 0; i <arr.length ; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if(arr[i].length()>arr[j].length()){
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
//    public int  display(){
//        e=arr.length-1;
//        while (S<=e){
//            int mid=S+(e-S)/2;
//            if(target1<arr[mid].length()){
//                e=mid-1;
//            }else if(target1>arr[mid].length()){
//                S=mid+1;
//            }
//        }
//        return -1;
//    }
public static void main(String[] args) {
    BinarySearchString obj=new BinarySearchString();
    obj.Sorting();
}
}
