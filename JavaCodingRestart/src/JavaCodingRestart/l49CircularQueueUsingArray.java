package JavaCodingRestart;

public class l49CircularQueueUsingArray {
    public static class CQ {
        int front =-1;
        int rear =-1;
        int size = 0;
        int arr[] = new int[5];
        void push(int val){
            if (size<5) {
                size++;
                if (front==-1) {
                    front=rear=0;
                    arr[0]=val;
                }
                else if (rear>-1) {
                    if (rear==4) {
                        rear=0;
                        arr[0] = val;
                    }
                    else{
                        arr[++rear] = val;
                    }
                }
            }
            else{
                System.out.println("full");
                return;
            }
        }
        int peek(){
            if (size==0) {
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
        
        int remove(){
            if (size==0) {
                System.out.println("empty");
                return -1;
            }
            else{
                size--;
                if (front==0 && rear==0) {
                    front=rear=-1;
                    return arr[front+1];
                }
                else if (front==4 && size-1>0) {
                    front=0;
                    return arr[4];
                }
                else{
                    return arr[front++];
                }
            }
        }
        void display(){
            if (size==0) {
                System.out.println("empty");
                return;
            }
            else{
                if (rear<front) {
                    for (int i = front; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    for (int i = 0; i < rear+1; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
                else{
                    for (int i = front; i < rear+1; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        CQ cq = new CQ();
        cq.push(1);
        cq.push(2);
        cq.push(3);
        cq.push(4);
        cq.push(5);
        cq.display();
        System.out.println(cq.size);
        cq.remove();
        cq.remove();
        cq.display();
        cq.push(6);
        cq.push(7);
        cq.display();
        System.out.println(cq.peek());
        System.out.println(cq.size);
        cq.push(9);
        cq.display();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
    }
}
