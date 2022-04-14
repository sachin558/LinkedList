public class DemoClass {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return root;
        }
        if(root.val==val){
            return root;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right,val);
        }
    }

    public static void main(String[] args) {
        DemoClass obj=new DemoClass();
        obj.searchBST();
    }
}