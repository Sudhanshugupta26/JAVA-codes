package JavaCodingRestart;

public class l44Merge2SortedList {
    public static Node mergeTwoLists1(Node list1, Node list2) { // Without Using Extra Space.
        Node temp1 = list1;
        Node temp2 = list2;
        if(temp1==null && temp2==null)return null;
        if(temp1==null)return temp2;
        if(temp2==null)return temp1;
        Node head = new Node(100);
        if(temp1.data>temp2.data){
            head = temp2;
            temp2=temp2.next;
        }else{
            head = temp1;
            temp1=temp1.next;
        }
        Node temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.data>temp2.data){
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }else{
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        else{
            temp.next=temp2;
        }
        return head;
    }
    public static Node mergeTwoLists2(Node list1, Node list2) {         //Using Extra space.
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100);
        Node ans = head;
        while(temp1!=null && temp2!=null){
            if(temp1.data>temp2.data){
                Node a = new Node(temp2.data);
                ans.next=a;
                ans=a;
                temp2=temp2.next;
            }else{
                Node a = new Node(temp1.data);
                ans.next=a;
                ans=a;
                temp1=temp1.next;
            }
        }
        if(temp1!=null){
            ans.next=temp1;
        }
        else{
            ans.next=temp2;
        }
        return head.next;
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
    }
}
