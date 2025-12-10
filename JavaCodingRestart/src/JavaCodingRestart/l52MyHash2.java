package JavaCodingRestart;

import java.util.LinkedList;

public class l52MyHash2 {
    static class MyHash<K,V> {
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        public static final int DEFAULT_CAPACITY = 4;

        private class Node {
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        
        private LinkedList<Node>[] buckets;
        
        private void initBucket(int len){
            buckets = new LinkedList[len];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        
        MyHash(){
            initBucket(DEFAULT_CAPACITY);
        }
        
        private void rehash(){
            LinkedList<Node>[] oldbuckets = buckets;
            initBucket(oldbuckets.length*2);
            n=0;
            for (var bucket : oldbuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc) % buckets.length);
        } 
        
        private int searchInBucket(LinkedList<Node> ll, K key){
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i ;
                }
            }
            return -1;
        }
        
        public int size(){
            return n;
        }
        
        public void put(K key, V value){
            if (n>= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei==-1) {// doesn't exist
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }
             else{// update
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
        }
        
        public V remove(K key){
            int bi =  HashFunc(key);
            int ei = searchInBucket(buckets[bi], key);
            if (ei!=-1) {
                Node curNode = buckets[bi].get(ei);
                V val = curNode.value;
                buckets[bi].remove(ei);
                n--;
                return val;

            }
            return null;
        }
        
        public V get(K key){
            int bi =  HashFunc(key);
            int ei = searchInBucket(buckets[bi], key);
            if (ei!=-1) {
                Node curNode = buckets[bi].get(ei);
                return curNode.value;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHash<String, Integer> mp = new MyHash<>();
        mp.put("a", 1);
        mp.put("b", 1);
        mp.put("c", 1);
        mp.put("d", 1);
        System.out.println(mp.size());
        mp.put("d", 2);
        System.out.println(mp.size());
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));
        System.out.println(mp.get("College"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        mp.put("m", 1);
        System.out.println(mp.size());

    }
}
