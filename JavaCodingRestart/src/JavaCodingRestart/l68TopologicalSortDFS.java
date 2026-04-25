package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l68TopologicalSortDFS {
    public static void topologicalSort(int n, int[][] adj){
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                dfs(i,adj,visited,ans);
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }

    private static void dfs(int i, int[][] adj, boolean[] visited, List<Integer> ans) {
        visited[i] = true;
        for (int j = 0; j < adj[i].length; j++) {
            if(!visited[adj[i][j]]){
                dfs(adj[i][j],adj,visited,ans);
            }
        }
        ans.add(i);
    }

    public static void main(String[] args) {

    }
}
