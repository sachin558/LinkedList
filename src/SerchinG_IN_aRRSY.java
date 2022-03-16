import java.awt.*;
import java.util.Scanner;

public class SerchinG_IN_aRRSY {
    String arr[];
    String str;
    int i,j;
    SerchinG_IN_aRRSY(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  the array ");
        arr=new String[sc.nextInt()];
        System.out.println("enter  the  the string array ");
        for (i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
    }
    void display() {
        System.out.println("enter target string ");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==str){
                System.out.println(arr[i]);
            }
//            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        SerchinG_IN_aRRSY obj=new SerchinG_IN_aRRSY();
        obj.display();
    }
}
