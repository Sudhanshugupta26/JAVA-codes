package JavaCodingRestart;

public class l43LinkedList {
    public static void display(Node a){
        if (a==null)return;
        System.out.println(a.data);
        display(a.next);
        return;
    }
    public static void display1(Node a){
        Node temp = a;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static int length(Node a){
        Node temp = a;
        int count=0;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static class Node{
        int data;   // Stores data.
        Node next;  // Stores address of the next "Node".
        Node(int data){
            this.data = data;
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
        System.out.println(a.data+" "+a.next);
        display(a);
        display1(a);
        System.out.println(length(a));
    }
}
