package JavaCodingRestart;

import java.util.*;

public class l68Dijkstra {
    private static class Pair {
        int node;
        int weight;
        public Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    public static class PairComparator implements Comparator<Pair> {
        public int compare(Pair o1, Pair o2) {
            if(o1.weight<o2.weight){
                return -1;
            }else if(o1.weight>o2.weight){
                return 1;
            }else{
                if(o1.node<o2.node) {
                    return -1;
                }else if(o1.node>o2.node) {
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        int len = times.length;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            adj.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }

        //Dijkstra's algo'
        int []ans = new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int node = p.node;
            int weight = p.weight;
            if(ans[node]<weight)continue; //Improvement!
            for(Pair pair : adj.get(node)){
                if(ans[node]+pair.weight<ans[pair.node]){
                    ans[pair.node] = ans[node]+pair.weight;
                    pq.add(new Pair(pair.node,ans[pair.node]));
                }
            }
        }


        int max = -1;
        for(int i=1;i<=n;i++){
            if(ans[i]==Integer.MAX_VALUE)return -1;
            if(ans[i]>max)max = ans[i];
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
