package BSTSerachPth;

public class BTest {
    int arr[];
    int lastusedindex;

    public BTest(int size) {
        arr = new int[size+1];
        this.lastusedindex = 0;
    }
    public void insert(int val)
    {
        if(arr.length-1 == lastusedindex)
        {
            System.out.println("Array is full");
        }
        else
        {
            arr[lastusedindex+1]= val;
            lastusedindex++;
        }
    }
    public void traversepreorder(int index)
    {
        if(index>lastusedindex)
        {
            return;
        }
        else {
            System.out.print(arr[index] + "  ");
            traversepreorder(index * 2);
            traversepreorder(index * 2 + 1);
        }
    }
    public void traverse(int index)
    {
        if(index>lastusedindex)
        {
            return;
        }
        else {
            traverse(index * 2);
            System.out.print(arr[index] + "   ");
            traverse(index * 2 + 1);
        }
    }
    public static void main(String[] args) {
        BTest obj = new BTest(5);
        obj.insert(13);
        obj.insert(34);
        obj.insert(42);
        obj.insert(12);
        obj.insert(78);
        obj.traverse(1);
        System.out.println();
        obj.traversepreorder(1);

    }

}
