public class linearsearch {
    static   void linearsearch1(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("value is found " + i);
            }
        }
        System.out.println("value is not found");

    }

    public static void main(String[] args) {
        int [] arr = { 1,3,4,5,657,7,8};
//        linearsearch obj1 = new linearsearch();
        linearsearch1(arr,0);
    }
}
