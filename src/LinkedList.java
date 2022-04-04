public class LinkedList{
    int data;
    LinkedList next;

    LinkedList(int data) {
        this.data = data;
    }
}
    class Test10{
        public static void move(LinkedList head) {
            LinkedList last = head;
            LinkedList secondlast = null;
            while (last.next != null) {
                secondlast = last;
                last = last.next;
            }
            last.next = head;
            secondlast.next = null;
            //head = last;
            //return head;
        }
        public static void display(LinkedList head){
            LinkedList temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    public static void main(String[] args) {
            LinkedList obj=new LinkedList(1);
            obj.next=new LinkedList(2);
            obj.next.next=new LinkedList(3);
            obj.next.next.next=new LinkedList(4);
        move(obj);
        display(obj);

    }
}
