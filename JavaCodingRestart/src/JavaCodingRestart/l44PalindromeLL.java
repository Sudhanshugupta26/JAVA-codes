package JavaCodingRestart;

public class l44PalindromeLL {
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
    public static boolean palindrome(Node head){
        Node slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null) {   // traversing to the middle of the list.
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverseList(slow.next); // reversing half of the list
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while (p2!=null) {
            if (p1.data!=p2.data) {         // comparing values.
                return false;
            }
            p2 = p2.next;
            p1 = p1.next;
        }
        return true;
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
        Node d = new Node(99);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println(palindrome(a));
        display(a);
    }
}