package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class l50ReOrderQueueUsingStack {
    static void ReOrder(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        int half = q.size()/2;
        // Step1: reversing the first half of q
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        // Step2: pushing the remaining half into st
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }
        // Step3: now pushing st element in q then q element in q alternately
        for (int i = 0; i < half; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }
        // Step4: reversing the queue
        for (int i = 0; i < n; i++) {
            st.push(q.remove());
        }
        for (int i = 0; i < n; i++) {
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(7);
        q.add(9);
        q.add(5);
        q.add(3);
        System.out.println(q);
        ReOrder(q);
        System.out.println(q);
    }
}
