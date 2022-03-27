public class ReverseArray {
    int t;
    int arr[]={1,3,5,6};
    int b[];
    int j=arr.length;
    public void display(){
        for (int i = 0; i < arr.length/2; i++) {
            int t=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=t;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        ReverseArray obj=new ReverseArray();
        obj.display();
    }

}
