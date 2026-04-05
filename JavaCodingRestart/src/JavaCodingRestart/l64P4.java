package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class l64P4 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k1 = 3;
        int k2 = 6;
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);
        int sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i<arr.size();i++){
            pq.add(arr.get(i));
            if (pq.size()>k2){
                pq.remove();
            }
        }
        // Smallest k2 elements
        pq.remove();
        // Removed k2th element

        while (pq.size()!=k1){
            sum += pq.remove();
        }
        System.out.println(sum);
    }
}
