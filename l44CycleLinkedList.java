package JavaCodingRestart;
public class l44CycleLinkedList {
    public static Node detectCycle(Node head) {
        if(head==null || head.next==null)return null;
        if(head==head.next.next)return head;
        Node slow = head;
        Node fast = head;
        int flag = -1;
        while(fast!=null){
            slow = slow.next;
            if(fast.next==null)return null;
            fast = fast.next.next;
            if(slow==fast){
                flag = 1;
                break;
            }
        }
        if(flag<0){
            return null;
        }
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        if(head==null || head.next==null)return false;
        while(fast!=null){
            if(fast.next==null || slow.next==null)return false;
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast)return true;
        }
        return false;
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
        e.next = a;
        System.out.println(hasCycle(a));
        System.out.println(detectCycle(a).data);
    }
}
