package JavaCodingRestart;

public class l43LLImplementation {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head==null) {
                head=temp;  // at this time head=temp & head --> null
            }
            else{
                tail.next=temp; // at this time tail.next = temp
            }
            tail=temp;  // at this time tail --> null or new tail created.
            size++;
        }
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count=0;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAtBeg(int data){
            Node temp = new Node(data);
            if (head==null) {
            head=tail=temp; // making head and tail both temp
            }
            else{
            temp.next=head; // giving the head into the temp.next
            head=temp;  // creating temp as head
            }
            size++;
        }
        void insert(int idx, int data){
            if (idx==size) {
                insertAtEnd(data);
                return;
            }
            else if (idx==0) {
                insertAtBeg(data);
            }
            else if (idx<0 || idx>size) {
                System.out.println("Wrong index");
                return;
            }
            Node temp = head;
            Node ele = new Node(data);
            int count=0;
            while (count<idx-1) {
                temp=temp.next;
                count++;
            }
            ele.next=temp.next;
            temp.next=ele;
            size++;
        }
        int getAt(int idx){
            if (idx<0 || idx>size) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if (idx<0 || idx>size) {
                System.out.println("Wrong index");
            }
            else if (idx==0) {
                head=head.next;
            }
            else{
                Node temp = head;
                for (int i = 0; i < idx-1; i++) {
                    temp = temp.next;
                }
                temp.next=temp.next.next;
                if (temp.next==null) {
                    tail=temp;
                }
            }
            size--;
        }
    }
    public static void main(String[] args) {
        linkedList a = new linkedList();
        a.insertAtEnd(32);
        a.insertAtEnd(43);
        a.display();
        System.out.println(a.size());
        a.insertAtBeg(12);
        a.insertAtBeg(3);
        a.display();
        a.insert(3, 342);
        a.display();
        System.out.println(a.getAt(12));
        System.out.println(a.size);
        a.deleteAt(0);
        System.out.println(a.tail.data);
        a.display();
        System.out.println(a.size);
    }
}
