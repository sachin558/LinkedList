public class BinarTreeFac {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node root;
    public BinarTreeFac(){
        root=null;
    }
    public int factorial(int num){
        int fact=1;
        if (num==0){
            return 1;
        }else {
            while (num>1){
                fact=fact*num;
                num--;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        BinarTreeFac obj=new BinarTreeFac();
        System.out.println(obj.factorial(5));
    }
}
