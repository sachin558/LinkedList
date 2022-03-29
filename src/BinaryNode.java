public class BinaryNode {
    BinaryNode left;
    BinaryNode right;
    int data;
    BinaryNode(int data){
        this.data=data;
    }
}
class Test{
    public static void main(String[] args) {
        BinaryNode root=new BinaryNode(15);
        BinaryNode rleft=new BinaryNode(10);
        BinaryNode rright=new BinaryNode(5);
        root.left=rleft;
        root.right=rright;
        print(root);
    }
    public static void print(BinaryNode root){
        if(root==null){
            return;
        }
        print(root.left);
        print(root.right);
        System.out.println(root.data);


    }
}
