import java.util.Scanner;

public class StringArray {
    String s;
    String arr[];
    StringArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entern the string ");
        s=sc.next();
        arr=s.split(" ");
//        s="the quick brown jumps over a lazy dog";
        arr=s.split("-");
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].length()>arr[j+1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length-j; k++) {

                }
            }
        }
    }
    public static void main(String[] args) {
        StringArray obj=new StringArray();
        obj.display();
    }
}


