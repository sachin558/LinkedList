public class Node {
    int data;
    Node left;
    Node right;
    int res;
    Node(int data){
        this.data=data;
    }
    public static boolean search(Node root,Node newNode){
        if(root==null){
            return false;
        }
        if(root.data== newNode.data){
            return true;
        }
        if (root.data< newNode.data){
            return true;
        }
        if(root.data>= newNode.data){
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        Node obj=new Node(10);
    }
}
