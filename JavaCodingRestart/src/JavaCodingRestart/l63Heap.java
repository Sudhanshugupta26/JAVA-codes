package JavaCodingRestart;

import java.util.ArrayList;
import java.util.List;

public class l63Heap {
    public static void heapSort(List<Integer> heap){
        heapify(heap);

        int n = heap.size()-1;
        for (int i = n; i > 0 ; i--) {
            swap(heap,0,i);
            pushDownInMinHeap(heap,0,i-1);
        }
    }

    public static void deleteFromMinHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);

        pushDownInMinHeap(heap,0, heap.size()-1);
    }

    private static void pushDownInMinHeap(List<Integer> heap, int i, int n) {

        if (i == n)return;

        int left = 2*i+1;
        int right = 2*i+2;
        int minIndex = i;

        if (left <= n && heap.get(left) < heap.get(minIndex)){
            minIndex = left;
        }
        if (right <= n && heap.get(right) < heap.get(minIndex)){
            minIndex = right;
        }

        if (minIndex != i) {
            swap(heap,i,minIndex);
            pushDownInMinHeap(heap,minIndex,n);
        }else return;
    }

    public static void heapify(List<Integer> heap){
        int firstNonLeafElement = ((heap.size()-1)-1)/2;

        for (int i = firstNonLeafElement; i >=0; i--) {
            pushDownInMinHeap(heap,i,heap.size()-1);
        }
    }

    public static void insertInMinHeap(List<Integer> heap, int data){
        heap.add(data);

        int index = heap.size()-1;
        pushUpInMinHeap(heap,index);
    }

    private static void pushUpInMinHeap(List<Integer> heap, int index) {
        if (index==0 )return;

        int parentIndex = (index-1)/2;

        if(heap.get(parentIndex)<=heap.get(index)){
            return;
        }

        swap(heap,index,parentIndex);
        pushUpInMinHeap(heap,parentIndex);
    }

    private static void swap(List<Integer> heap, int index, int parentIndex) {
        int temp = heap.get(index);
        heap.set(index,heap.get(parentIndex));
        heap.set(parentIndex,temp);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        heapify(heap);
        System.out.println(heap);
        insertInMinHeap(heap,40);
        System.out.println(heap);
        deleteFromMinHeap(heap);
        System.out.println(heap);
        heapSort(heap);
        System.out.println(heap);
    }
}
