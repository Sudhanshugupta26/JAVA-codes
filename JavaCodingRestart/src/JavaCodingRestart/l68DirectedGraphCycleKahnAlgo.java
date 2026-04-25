package JavaCodingRestart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l68DirectedGraphCycleKahnAlgo {
    public boolean canFinish(int n, int[][] preq) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            adj.add(new ArrayList<>());
        }

        int[] indeg = new int[n];
        for(int i = 0; i<preq.length ;i++){
            adj.get(preq[i][1]).add(preq[i][0]);
            indeg[preq[i][0]]++;
        }

        //kahn's algo
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(q.size()>0){
            int front = q.remove();
            ans.add(front);
            for(int ele: adj.get(front)){
                indeg[ele]--;
                if(indeg[ele]==0){
                    q.add(ele);
                } 
            }
        }
        if(ans.size()<n)return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
