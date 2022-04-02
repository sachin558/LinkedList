import java.security.PublicKey;

public class BinarySeaching {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node root;
    public static  boolean flag=false;
    public void SearchinNode(Node temp,int value){
        if (root==null){
            System.out.println("Tree is the empty");
        }
        else{
            if(temp.data==value){
                flag=true;return;
            }
            if (flag==false&&temp.left!=null){
                SearchinNode(temp.left,value);
            }
            if (flag==false&&temp.right!=null){
                SearchinNode(temp.right,value);
            }
        }
    }

    public static void main(String[] args) {
        BinarySeaching obj=new BinarySeaching();
        obj.root=new Node(11);
        obj.root.left=new Node(8);
        obj.root.right=new Node(12);
        obj.root.left.left=new Node(78);
        obj.root.right.left=new Node(23);
        obj.root.right.right=new Node(36);
        obj.SearchinNode(obj.root, 23);
        if (flag){
            System.out.println("Element present in the binary tree ");
        }
        else {
            System.out.println("Element os the not present in the binary tree");
        }
    }

}
