import org.w3c.dom.Node;

public class CreatLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printlist(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        CreatLinkedList obj=new CreatLinkedList();
        obj.head=new Node(1);
        Node second=new Node(30);
        Node thrid=new Node(40);
        obj.head.next=second;
        second.next=thrid;
        obj.printlist();
    }
}
