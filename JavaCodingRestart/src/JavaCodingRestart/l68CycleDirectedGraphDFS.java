package JavaCodingRestart;

import java.util.ArrayList;
import java.util.List;

public class l68CycleDirectedGraphDFS {
    static boolean ans;

    public void dfs(int i, List<List<Integer>> adj , boolean[] vis, boolean[] path){
        vis[i] = true;
        path[i] = true;
        for(int ele: adj.get(i)){
            if(path[ele]==true){
                ans=false;
                return;
            }
            if(vis[ele]==false)dfs(ele,adj,vis,path);
        }
        path[i] = false; //Backtracking for a perticular path
    }

    public boolean canFinish(int n, int[][] preq) {
        ans = true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i<preq.length ;i++){
            adj.get(preq[i][1]).add(preq[i][0]);
        }

        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        for(int i=0 ; i< n ;i++){
            if(vis[i]==false)dfs(i,adj,vis,path);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
