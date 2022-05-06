 public class BTreeBYArray {
    int arr[];
    int lastuesdIndex;
    BTreeBYArray(int size){
        arr=new int[size+1];
        lastuesdIndex=0;
    }
    public void insert(int val){
        if(arr.length-1==lastuesdIndex){
            System.out.println("Array is the full ");
        }
        else {
            arr[lastuesdIndex]=val;
            lastuesdIndex++;
        }
    }
    public void preodertraversal(int index){
        if(index>lastuesdIndex){
            return;
        }
        else{
            System.out.println(arr[index]+" ");
            preodertraversal(index*2);
            preodertraversal(index*2+1);
        }
    }
    public void traversal(int index){
        if(index>lastuesdIndex){
            return;
        }
        traversal(index*2);
        System.out.println(arr[index]+" ");
        traversal(index*2+1);
    }

     public static void main(String[] args) {
        BTreeBYArray obj=new BTreeBYArray(5);
        obj.insert(14);
        obj.insert(90);
        obj.insert(67);
        obj.insert(56);
        obj.insert(89);
        obj.traversal(1);
         System.out.println();
        obj.preodertraversal(1);
     }
}
