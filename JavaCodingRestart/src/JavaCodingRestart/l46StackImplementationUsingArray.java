package JavaCodingRestart;

public class l46StackImplementationUsingArray {
    public static class Stack {
        private int[] arr = new int[10];
        private int idx = 0;
        void push(int x){
            if (idx==10) {
                System.out.println("Stack Overflow!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int size(){
            if (isEmpty()) {
                System.out.println("Empty!");
                return -1;
            }
            return idx;
        }
        int peek(){
            if (idx==0) {
                System.out.println("Stack UnderFlow!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if (idx==0) {
                System.out.println("Stack UnderFlow!");
                return -1;
            }
            idx--;
            return arr[idx];
        }
        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if (idx==0) {
                return true;
            }
            return false;
        }
        boolean isFull(){
            if (idx==10) {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
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
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        st.push(21);
        st.push(3);
        st.push(32);
        System.out.println(st.isFull());
        System.out.println(st.size());
        st.push(322);
        
    }
}
