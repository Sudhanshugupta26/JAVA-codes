package JavaCodingRestart;

public class l49ImplementingQueueWithArray {
    public static class queue {
        int f=-1;
        int r=-1;
        int arr[] =new int[100];
        int size = 0;
        void push(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            size++;
            if (f==-1) {
                f=r=0;
                arr[r] = val;
                return;
            }
            else{
                arr[++r]=val;
                return;
            }
        }
        
        int peek(){
            if (size==0) {
            System.out.println("empty");
            return -1;
            }
            return arr[f];
        }
        int remove(){
            if (size==0) {
                System.out.println("empty");
                return -1;
            }
            else if (f==0 && r==0) {
                f=r=-1;
                size--;
                return arr[f+1];
            }
            f++;
            size--;
            return arr[f-1];
        }
        void display(){
            if(size==0){
                System.out.println("empty");
            }
            else{
                for (int i = f; i < r+1; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.isEmpty());
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        System.out.println(q.size);
        q.remove();
        System.out.println(q.size);
        q.display();

    }
}
