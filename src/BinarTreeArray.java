public class BinarTreeArray {
    int arr[];
    int lastusedindex;
    public BinarTreeArray(int size){
        arr=new int [size+1];
        lastusedindex=0;
    }
    public void insert(int value){
        if (lastusedindex>arr.length-1){
            return;
        }
        arr[++lastusedindex]=value;
    }
    public void Preorder(int index){
        if(index>lastusedindex){
            return;
        }
        System.out.println(arr[index]);
        Preorder(2*index);
        Preorder(2*index+1);
    }
    public int Searching(int value){
        for (int i = 0; i < lastusedindex; i++) {
            if(arr[i]==value){
                return i;
            }else {
                return -1;
            }
        }
        return value;
    }
    public void delete(int value){
        int res=Searching(value);
        if(res==-1){
            System.out.println("value not allowed");
        }
        arr[res]=arr[lastusedindex];
    }

    public static void main(String[] args) {
        BinarTreeArray obj=new BinarTreeArray(5);

    }
}
