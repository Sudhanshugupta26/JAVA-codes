package JavaCodingRestart;

public class l49ImplementingQueueUsingLL {
    public static class Node {  //linked list
        int val;
        Node next;
    }
    public static class queue{
        Node head;
        Node tail;
        int size=0;
        void push(int val){
            size++;
            Node newNode = new Node();
            if (head==null) {
                newNode.val = val;
                head=tail=newNode;
            }
            else{
                newNode.val = val;
                tail.next=newNode;
                tail=tail.next;
            }
        }
        int remove(){
            if (size==0) {
                System.out.println("empty");
                return -1;
            }
            else{
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }
        }
        int peek(){
            if (size==0) {
                System.out.println("empty");
                return -1;
            }
            return head.val;
        }
        void display(){
            if (size==0) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        System.out.println(q.size);
        q.remove();
        System.out.println(q.size);
        q.display();
        System.out.println(q.peek());
    }
}
