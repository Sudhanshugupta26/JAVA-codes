package JavaCodingRestart;

import java.util.Deque;
import java.util.LinkedList;

public class l49Deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.add(2);
        System.out.println(dq);
        dq.removeFirstOccurrence(2);
        System.out.println(dq);
    }
}
