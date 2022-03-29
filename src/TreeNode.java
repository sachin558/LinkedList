public class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;
    TreeNode(int data){
        this.data=data;
    }
    public static void display(TreeNode root){
        if(root==null){
            return;
        }
        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(15);
        TreeNode rleft=new TreeNode(10);
        TreeNode rleft1=new TreeNode(5);
        TreeNode  rright1=new TreeNode(20);
        TreeNode rright=new TreeNode(3);
        root.left=rleft;
        root.left.left=rleft1;
        root.right=rright1;
        root.right.right=rright;

        display(root);
    }
}
