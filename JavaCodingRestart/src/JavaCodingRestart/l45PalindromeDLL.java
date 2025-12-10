package JavaCodingRestart;

public class l45PalindromeDLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean palindrome(Node head){
        Node tail = head;
        Node Head = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        while (Head!=tail) {
            if (Head.val!=tail.val) {
                return false;
            }
            tail = tail.prev;
            Head = Head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(8);
        Node e = new Node(2);
        Node f = new Node(1);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.prev=e;
        e.prev=c;
        c.prev=b;
        b.prev=a;
        System.out.println(palindrome(a));
    }
}
