package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l49Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(6);
        //System.out.println(q);        this will also directly print the queue as it is.
        while (q.size()!=0) {
            System.out.println(q.peek());
            helper.add(q.remove());
        }
        System.out.println(q);
        System.out.println(helper);
        System.out.println(helper.isEmpty());
        System.out.println(helper.remove());
        System.out.println(helper);
    }
}
