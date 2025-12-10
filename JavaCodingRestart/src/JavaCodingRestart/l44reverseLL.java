package JavaCodingRestart;
public class l44reverseLL {
    public static Node reverseList(Node head) { // loop (effective)
        Node prev=null,curr=head,agla=head;
        while(curr!=null){
            agla = curr.next;
            curr.next=prev;
            prev = curr;
            curr=agla;
        }
        return prev;
    }
    public static Node reverse(Node head){ // recursion
        if(head==null)return null;
        if(head.next==null)return head; 
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return newhead;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static class Node{
        int data;   // Stores data.
        Node next;  // Stores address of the next "Node".
        //static int size =0;
        Node(int data){
            this.data = data;
            //size++;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(44);
        Node c = new Node(234);
        Node d = new Node(243);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        a=reverse(a);
        display(a);
        System.out.println();
        a = reverseList(a);
        display(a);
    }
}