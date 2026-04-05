package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class l64P1 {
    // Question: Find the kth largest element in an unsorted array.
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);

        // This Approach TC O(NlogN) and SC O(N)
        List<Integer> ans = new ArrayList<>(arr);   // It internaly uses Arrays.copyOf() method so the copy is Deep copy.
        ans.sort(Comparator.reverseOrder());
        System.out.println(ans.get(k-1));

        //Another way TC O(NlogN)(Due to insertions and deletions in heap) and SC O(K)
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //Min Heap
        for (int i : arr){ //O(N)
            if (pq.size()==(k)){
                // agar top chotta hai, toh remove kar diya.
                if (pq.peek()<i) {
                    pq.poll();
                    pq.add(i);
                }
                continue;
            }
            pq.add(i);
        }
        System.out.println(pq.peek());
    }
}
