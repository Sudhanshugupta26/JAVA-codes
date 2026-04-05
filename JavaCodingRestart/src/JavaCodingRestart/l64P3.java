package JavaCodingRestart;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class l64P3 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);

        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
        System.out.println(pq);
        for (int i = 0; i < k; i++) {
            int f = pq.poll();
            int s = pq.poll();
            pq.add(f*s);
        }
        while (pq.size()!=1) {
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}
