package JavaCodingRestart;

import java.util.*;

public class l51PriorityQueue {
    static void PriorityQueue(){
        // PriorityQueue<Integer> pq = new PriorityQueue<>();  // by default min PQ(minimum element has most priority)
        // pq.add(20);
        // pq.add(10);
        // pq.add(5);
        // System.out.println(pq); // minimum element comes to front and rest are them in inserting order.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // PQ for max
        pq.add(5);
        pq.add(10);
        pq.add(20);
        System.out.println(pq); // maximum element comes to front and rest are them in inserting order.
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        PriorityQueue();
    }
}
