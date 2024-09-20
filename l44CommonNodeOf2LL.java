package JavaCodingRestart;

public class l44CommonNodeOf2LL {
    public static int length(Node head){
        Node temp = head;
        int length = 0;
        while (temp!=null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static Node intersectionNode(Node head1, Node head2){
        Node temp1= head1;
        Node temp2= head2;
        int n1 = length(head1);
        int n2 = length(head2);
        if (n1>n2) {
            int steps=n1-n2;
            while (steps>0) {
                temp1 = temp1.next;
                steps--;
            }
        }else{
            int steps=n2-n1;
            while (steps>0) {
                temp2 = temp2.next;
                steps--;
            }
        }
        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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
        // list 1
        Node a = new Node(5);
        Node b = new Node(44);
        Node c = new Node(234);
        Node d = new Node(243);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //list 2
        Node q = new Node(5);
        Node w = new Node(44);
        Node r = new Node(234);
        Node t = new Node(243);
        Node y = new Node(16);
        Node u = new Node(16);
        Node i = new Node(16);
        q.next = w;
        w.next = r;
        r.next = t;
        t.next = y;
        y.next = u;
        u.next = i;
        Node ans = intersectionNode(a, q);
        if (ans!=null) {
            System.out.println(ans.data);
        }else{
            System.out.println("No");
        }
    }
}
