package JavaCodingRestart;

public class l45CircularSinglyLL {
    public static class Node{
        int data;   // Stores data.
        Node next;  // Stores address of the next "Node".
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node node){
        Node temp = node.next;
        System.out.print(node.data+" ");
        while (temp!=node) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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
        e.next = a;
        display(c);
    }
}
