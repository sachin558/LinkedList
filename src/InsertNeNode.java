public class InsertNeNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
        }
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                insert(root.left, newNode);
            }
        } else if (newNode.data > root.data) {
            if (root.right == null) {
                root.right = newNode;
            } else {
                insert(root.right, newNode);
            }
            public static void inorder(Node root)
            {
                if(root== null)
                {
                    return;
                }
                inorder(root.left);
                System.out.println(root.data);
                inorder(root.right);
            }
        }
    }
    public static void main(String[] args) {

        Node n=new Node(30);
        Node n1=new Node(20);
        Node n2=new Node(25);
        Node n3=new Node(40);
        Node n4=new Node(35);
        Node n5=new Node(38);
        insert(null,n);
        insert(n,n1);
        insert(n,n2);
        insert(n,n3);
        insert(n,n4);
        insert(n,n5);
        System.out.println("Traverse the  in inorder");
        // inorder(n);
    }
}
