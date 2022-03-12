public class IJSingleDimentionArray {
    int arr[]; // instance variable

    public IJSingleDimentionArray()
    {
        arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    // method to traverse the array
    // print all the values stored in the array
    public void print()
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    // method to insert the value in the array
    public void insert(int index, int value)
    {
        try
        {
            if(arr[index]== Integer.MIN_VALUE)
            {
                arr[index]= value;
            }
            else
            {
                System.out.println("already filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("invalid index");
        }
    }
    public void search(int value)
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == value)
            {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("value not found");
    }
    public void printindexvalue(int index)
    {
        System.out.println(arr[index]);
    }

}
class Test34
{
    public static void main(String[] args) {
        IJSingleDimentionArray obj = new IJSingleDimentionArray();
        obj.search(0);
        obj.insert(1,90);

    }
}
