package JavaCodingRestart;

public class l45twoSumInDLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void TwoSum(Node head,int target){
        Node Head = head;
        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        while (Head.val<tail.val) {
            if (Head.val+tail.val==target) {
                System.out.println(Head.val+" "+tail.val);
                return;
            }
            else if (Head.val+tail.val>target) {
                tail=tail.prev;
            }
            else{
                Head = Head.next;
            }
        }
        System.out.println("None");
    }
    public static void main(String[] args) {
        //sorted
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(8);
        Node e = new Node(9);
        Node f = new Node(40);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.prev=e;
        e.prev=c;
        c.prev=b;
        b.prev=a;
        TwoSum(a, 10);
}
}