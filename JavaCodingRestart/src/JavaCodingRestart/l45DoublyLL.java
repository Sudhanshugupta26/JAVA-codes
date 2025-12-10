package JavaCodingRestart;

public class l45DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayall(Node node){
        Node temp = node;
        while (temp.prev!=null) {
            temp=temp.prev;
        }
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAthead(Node head,int val){
        Node temp = new Node(val);
        head.prev=temp;
        temp.next=head;
        return temp;
    }
    public static Node insertAtTail(Node head,int val){
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node newNode = new Node(val);
        temp.next=newNode;
        newNode.prev=temp;
        return newNode;
    }
    public static void insertAtIdx(Node head,int idx,int val){// 0 based indexing
        Node temp =head;
        while (idx!=1) {
            temp=temp.next;
            idx--;
        }
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    public static void main(String[] args) {
        // null < 1 <> 2 <> 65 <> 8 <> 4 <> 6 > null
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(65);
        Node d = new Node(8);
        Node e = new Node(4);
        Node f = new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.prev=e;
        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        display(a);
        displayrev(f);
        displayall(e);
        displayall(b);
        displayall(d);
        insertAtIdx(a, 3, 43);
        display(a);
        Node A = insertAthead(a, 12);
        Node g = insertAtTail(a, 440);
        display(A);
        displayrev(g);
    }
}
