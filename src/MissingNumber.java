import java.util.Scanner;

public class MissingNumber {
    int diff=0;
    int atual=0;
    int N=0;
    int sum=0;
    int arr[];
    MissingNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        arr=new int[sc.nextInt()];
        System.out.println("enter the integer number ");
        N=sc.nextInt();
    }
    public void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element  in the array ");
        for (int i = 0; i <=arr.length-1 ; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for (int i = 0; i <=N ; i++) {
            atual+=i;
        }
        diff =atual-sum;
        System.out.println(diff);
    }

    public static void main(String[] args) {
        MissingNumber obj=new MissingNumber();
        obj.display();
    }
}
