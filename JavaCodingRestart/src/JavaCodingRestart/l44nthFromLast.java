package JavaCodingRestart;

public class l44nthFromLast {
    public static Node nthFromLast(Node head ,int idx){
        Node temp = head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        //int a = head.size - idx;
        int a = count - idx + 1;
        temp = head;
        int flag=0;
        while (flag!=a) {
            temp=temp.next;
            flag++;
        }
        return temp;
    }
    public static Node nthFromLast2(Node head, int idx){
        Node Slow=head;
        Node Fast=head;
        for (int i = 0; i < idx; i++) {
            Fast = Fast.next;
        }
        while (Fast!=null) {
            Slow = Slow.next;
            Fast = Fast.next;
        }
        return Slow;
    }
    public static Node deleteFromNth(Node head ,int idx){
        Node Slow=head;
        Node Fast=head;
        for (int i = 0; i < idx; i++) {
            Fast = Fast.next;
        }
        if (Fast==null) {
            head = head.next;
            return head;
        }
        while (Fast.next!=null) {
            Slow = Slow.next;
            Fast = Fast.next;
        }
        Slow.next = Slow.next.next;
        return head;
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
        Node ans = nthFromLast(a,2);
        System.out.println(ans.data);
        Node ans1 = nthFromLast2(a,2);
        System.out.println(ans1.data);
        display(a);
        a = deleteFromNth(a, 1);
        display(a);
    }
}
