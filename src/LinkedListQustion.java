import org.w3c.dom.Node;

public class LinkedListQustion {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
//            this.next = null;
        }
    }

    public void insert(int data) {
        Node Newnode = new Node(data);
        if (head == null) {
            head = Newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
        }
    }
    public void display(){
        if(head==null){
            System.out.println("empty");
        }
            Node temp=head;
            while (temp!=null){
                System.out.println();
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
        System.out.println(temp.data);

        }

    public static void main(String[] args) {
        LinkedListQustion obj=new LinkedListQustion();
        obj.insert(10);
        obj.insert(20);
        obj.display();
    }
}
