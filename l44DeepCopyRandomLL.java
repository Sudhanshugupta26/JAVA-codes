package JavaCodingRestart;

public class l44DeepCopyRandomLL {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val+" "+temp.random);
            temp=temp.next;
        }
    }

    public static Node copyRandomList(Node head) {
        Node temp = head.next;
        Node copy = new Node(head.val);
        Node headcopy = copy;
        // deep Copy without random.
        while(temp!=null){
            Node next = new Node(temp.val);
            copy.next = next;
            copy = copy.next;
            temp = temp.next;
        }
        display(head);
        System.out.println();
        display(headcopy);
        System.out.println();
        temp = head;
        copy = headcopy;
        Node temp2 = head.next;
        // Connecting both lists.
        while(temp.next!=null){
            temp.next = copy;
            temp = temp2;
            temp2 = copy.next;
            copy.next = temp;
            copy = temp2;
            temp2 = temp.next;
        }
        temp.next = copy;
        display(head);
        System.out.println();
        temp=head;
        temp2=head.next;
        // assigning randoms
        while(temp!=null && temp2!=null){
            if(temp.random==null)temp2.random = null;
            else temp2.random = temp.random.next;
            temp=temp2.next;
            if(temp!=null)temp2 = temp.next;
        }
        display(head);
        System.out.println();
        temp=head;
        temp2=head.next;
        // seperating lists.
        while(temp!=null){
            if(temp.next.next==null)temp.next = null;
            else {
                temp.next=temp.next.next;
                temp2.next=temp2.next.next;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        display(headcopy);
        System.out.println();
        display(head);
        System.out.println();
        return headcopy;
    }
    public static class Node{
        int val;   // Stores data.
        Node next;  // Stores address of the next "Node".
        Node random;
        //static int size =0;
        Node(int data){
            this.val = data;
            //size++;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(44);
        Node c = new Node(234);
        Node d = new Node(243);
        Node e = new Node(16);
        a.random = null;
        b.random = d;
        c.random = b;
        d.random = e;
        e.random = c;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node ncopy = copyRandomList(a);
        display(ncopy);
    }
}