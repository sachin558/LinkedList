/*
write the program  to find the minimum and max value in the tree
 */
class Node{
    int data;
    Node left,rifht;
    Node(int data){
        this.data=data;
    }
}
public class BinarSeachTree {
    Node root;
    static int Max(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int r=root.data;
        int lr=Max(root.left);
        int rr=Max(root.rifht);
        if (lr>r)
            r= lr;

        if (rr>r)
            r=rr;
        return r;
    }
    public static int Min(Node root){
        if (root==null){
            return Integer.MAX_VALUE;
        }
        int r=root.data;
        int lr=Min(root.left);
        int rr=Min(root.rifht);
        if (lr<r)
            r=lr;
        if (rr<r)
            r=rr;
        return r;

    }
public static void main(String[] args) {
    BinarSeachTree tre=new BinarSeachTree();
    tre.root=new Node(2);
    tre.root.left=new Node(7);
    tre.root.rifht=new Node(5);
    tre.root.left.rifht=new Node(6);
    System.out.println("Max value "+ Max(tre.root));
    System.out.println("Min value "+Min(tre.root));
}
}
