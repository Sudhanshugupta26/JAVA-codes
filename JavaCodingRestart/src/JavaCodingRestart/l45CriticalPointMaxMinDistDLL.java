package JavaCodingRestart;

public class l45CriticalPointMaxMinDistDLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void SumMinMax(Node head){
        Node c1 = head;
        Node c2 = head;
        Node temp = head.next;
        int counter = 0;
        int min = 1000000000;
        int max = 0;
        while (temp.next!=null) {
            if (temp.prev.val<temp.val && temp.val>temp.next.val) {
                if (c1==head) {
                    c1=temp;
                    counter = 0;
                }
                else if (c2==head) {
                    c2=temp;
                    if (min>counter) {
                        min=counter;
                    }
                    max+=counter;
                    counter=0;
                }
                else{
                    c1=c2;
                    c2=temp;
                    if (min>counter) {
                        min=counter;
                    }
                    max+=counter;
                    counter=0;
                }
            }
            else if (temp.prev.val>temp.val && temp.val<temp.next.val) {
                if (c1==head) {
                    c1=temp;
                    counter = 0;
                }
                else if (c2==head) {
                    c2=temp;
                    if (min>counter) {
                        min=counter;
                    }
                    max+=counter;
                    counter=0;
                }
                else{
                    c1=c2;
                    c2=temp;
                    if (min>counter) {
                        min=counter;
                    }
                    max+=counter;
                    counter=0;
                }
            }
            counter++;
            temp=temp.next;
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(9);
        Node c = new Node(65);
        Node d = new Node(8);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.prev=h;
        h.prev=g;
        g.prev=f;
        f.prev=e;
        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        SumMinMax(a);
    }
}
