package BSTSerachPth;

public class insert {
    public static void insert1(Node root,Node newnode ){
        if (root==null){
            root=newnode;
        }
        else if(newnode.data< root.data){
            if (root.left==null){
                root.left=newnode;
            }else {
                insert1(root.left,newnode);
            }
        }else if (newnode.data> root.data){
            if(root.right==null){
                root.right=newnode;
            }
            else {
                insert1(root.right,newnode);
            }
        }

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.right);
        System.out.println(root.data);
        inorder(root.left);
    }

    public static void main(String[] args) {
        insert root=new insert();
        Node n1=new Node(40);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        insert1(null,n1);
        insert1(n1,n2);
        insert1(n1,n3);
        insert1(n1,n4);
        inorder(n1);
    }
}
