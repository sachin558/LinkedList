package Sachin;

public class Node6 {
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
    }
}
 class insertion{
    static Node6 head;
    public static Node6 insert(int data){
        Node6 newnode=new Node6(data);
        if(head==null){
            head=newnode;
        }
        Node6 temp=head;
        while (temp!=null){
            temp=temp.next;
        }
        temp=newnode;
        return newnode;
    }
    public static void display(Node6 ans){
        if(head==null){
            System.out.println("empty ");
        }else {
            Node6 temp=head;
            while (temp!=null){
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
        }
    }

     public static void main(String[] args) {
//        Node6 newnode=new Node6()
         Node6 ans=insert(100);
         Node6 an=insert(200);
         display(ans);
         display(an);
     }
}