package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class l64P6 {
    private static void insert(PriorityQueue<Integer> rightPQ, PriorityQueue<Integer> leftPQ, int val){
        if(leftPQ.isEmpty()){
            leftPQ.add(val);
            return;
        }

        if(val<leftPQ.peek()) {
            if (rightPQ.size() == leftPQ.size()) {
                leftPQ.add(val);
            } else {
                rightPQ.add(leftPQ.poll());
                leftPQ.add(val);
            }
        }else{
            if(rightPQ.size()==leftPQ.size()){
                leftPQ.add(rightPQ.poll());
                rightPQ.add(val);
            }else{
                rightPQ.add(val);
            }
        }
    }

    private static double median(PriorityQueue<Integer> rightPQ, PriorityQueue<Integer> leftPQ){
        if (leftPQ.isEmpty()) return -1.0;
        if (leftPQ.size() - rightPQ.size() == 1) return (double)leftPQ.peek();
        else {
            return (double) (rightPQ.peek() + leftPQ.peek()) / 2;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        PriorityQueue<Integer> rightPQ = new PriorityQueue<>();//Min heap
        PriorityQueue<Integer> leftPQ = new PriorityQueue<>(Comparator.reverseOrder());
        insert(rightPQ, leftPQ, 15);
        System.out.println(median(rightPQ, leftPQ));
        insert(rightPQ, leftPQ, 10);
        System.out.println(median(rightPQ, leftPQ));
        insert(rightPQ, leftPQ, 5);
        insert(rightPQ, leftPQ, 20);
        System.out.println(median(rightPQ, leftPQ));
        insert(rightPQ, leftPQ, 25);
        System.out.println(median(rightPQ, leftPQ));
        insert(rightPQ, leftPQ, 30);
        System.out.println(median(rightPQ, leftPQ));
    }
}
