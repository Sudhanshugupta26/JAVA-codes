package JavaCodingRestart;

public class l46StackImplementationUsingLL {
    public static class Node {
        private Node next;
        private int val;
        public Node(int val){
            this.val =val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int idx = 0;
        void push(int x){
            Node temp = new Node(x);
            idx++;
            temp.next = head;
            head=temp;
        }
        int peek(){
            if (idx==0) {
                System.out.println("Stack Empty!");
                return -1;
            }
            return head.val;
        }
        int pop(){
            if (idx==0) {
                System.out.println("Stack Underflow!");
                return-1;
            }
            int temp = head.val;
            head = head.next;
            idx--;
            return temp;
        }
        void displayrec(Node head){
            if (head==null) {
                return;
            }
            displayrec(head.next);
            System.out.print(head.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.pop();
        st.push(10);
        st.push(1);
        st.push(10123);
        st.push(1013);
        st.push(1022);
        st.push(1099);
        st.push(1034);
        st.push(103);
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        st.push(21);
        st.push(3);
        st.push(32);
        System.out.println(st.size());
    }
}
